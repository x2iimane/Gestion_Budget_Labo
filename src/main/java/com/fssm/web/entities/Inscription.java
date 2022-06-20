/**
 * 
 */
package com.fssm.web.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fssm.web.enums.Motif;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */
@Entity
@DiscriminatorValue(value = "inscription")
public class Inscription extends ExpressionBesoin{

	private double fraisInscription;
	private String intituleEvenement;
	private LocalDate dateEvenement;
	public double getFraisInscription() {
		return fraisInscription;
	}
	public void setFraisInscription(double fraisInscription) {
		this.fraisInscription = fraisInscription;
	}
	public String getIntituleEvenement() {
		return intituleEvenement;
	}
	public void setIntituleEvenement(String intituleEvenement) {
		this.intituleEvenement = intituleEvenement;
	}
	public LocalDate getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(LocalDate dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inscription(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre,
			AnneeCivile anneeCivile) {
		super(motif, description, createdAt, updatedAt, membre, anneeCivile);
		// TODO Auto-generated constructor stub
	}
	public Inscription(double fraisInscription, String intituleEvenement, LocalDate dateEvenement) {
		super();
		this.fraisInscription = fraisInscription;
		this.intituleEvenement = intituleEvenement;
		this.dateEvenement = dateEvenement;
	}
	
	
}

