/**
 * 
 */
package com.fssm.web.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Laboratoire {
	
	@Id
	private String id;
	private String intitule;
	private String acronyme;
	private String telephone;
	private String description;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "anneeCivile", fetch = FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Budget budget;
	
	@OneToMany(mappedBy = "laboratoire" , fetch = FetchType.EAGER)
	@JsonProperty(access = Access.WRITE_ONLY)
	List<Membre> membres = new ArrayList<Membre>();
	
	
	public Laboratoire(String intitule, String acronyme, String telephone, String description, Budget budget,
			List<Membre> membres) {
		super();
		this.intitule = intitule;
		this.acronyme = acronyme;
		this.telephone = telephone;
		this.description = description;
		this.budget = budget;
		this.membres = membres;
	}
	public Budget getBudget() {
		return budget;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public List<Membre> getMembres() {
		return membres;
	}
	public void setMembres(List<Membre> membres) {
		this.membres = membres;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getAcronyme() {
		return acronyme;
	}
	public void setAcronyme(String acronyme) {
		this.acronyme = acronyme;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Laboratoire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laboratoire(String intitule, String acronyme, String telephone, String description) {
		super();
		this.intitule = intitule;
		this.acronyme = acronyme;
		this.telephone = telephone;
		this.description = description;
	}
	public Laboratoire(String id, String intitule, String acronyme, String telephone, String description, Budget budget,
			List<Membre> membres) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.acronyme = acronyme;
		this.telephone = telephone;
		this.description = description;
		this.budget = budget;
		this.membres = membres;
	}
	

}
