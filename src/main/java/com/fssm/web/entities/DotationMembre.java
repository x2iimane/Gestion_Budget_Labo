/**
 * 
 */
package com.fssm.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

	@ManyToOne
	AnneeCivile anneeCivile;
	
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

	public AnneeCivile getAnneeCivile() {
		return anneeCivile;
	}

	public void setAnneeCivile(AnneeCivile anneeCivile) {
		this.anneeCivile = anneeCivile;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public DotationMembre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DotationMembre(double somme, AnneeCivile anneeCivile, Membre membre) {
		super();
		this.somme = somme;
		this.anneeCivile = anneeCivile;
		this.membre = membre;
	}
	

}
