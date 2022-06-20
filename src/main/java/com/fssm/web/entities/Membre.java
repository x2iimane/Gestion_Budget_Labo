/**
 * 
 */
package com.fssm.web.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Imane Rafiq 19 juin 2022 Gestion_Budget_Labo
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Data @NoArgsConstructor @AllArgsConstructor
public class Membre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Grade grade;
	private Specialite specialite;
	private LocalDate dateNaissance;
	
	@ManyToOne
	Laboratoire laboratoire;
	
	@OneToMany(mappedBy = "membre" , fetch =  FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	List<DotationMembre> dotationMembres = new ArrayList<DotationMembre>();
	
	@OneToMany(mappedBy = "membre" , fetch =  FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	List<ExpressionBesoin> expressionBesoins = new ArrayList<ExpressionBesoin>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Membre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membre(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.specialite = specialite;
		this.dateNaissance = dateNaissance;
	}

	
	
	
	
	
	
	
	
	
	
	
}
