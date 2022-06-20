/**
 * 
 */
package com.fssm.web.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Imane Rafiq 19 juin 2022 Gestion_Budget_Labo
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DotationMembre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double somme;

	//@ManyToOne
	//AnneeCivile anneeCivile;
	//@OneToMany(mappedBy = "anneeCivile", fetch = FetchType.LAZY)
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	//private List<DotationMembre> dotationMembre = new ArrayList<DotationMembre>();

	@ManyToOne
	Budget budget;

	@ManyToOne
	Membre membre;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSomme() {
		return somme;
	}

	public void setSomme(double somme) {
		this.somme = somme;
	}


	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}



	public DotationMembre(double somme,  Membre membre) {
		super();
		this.somme = somme;
		this.membre = membre;
	}
	

}
