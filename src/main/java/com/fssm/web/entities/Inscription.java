/**
 * 
 */
package com.fssm.web.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fssm.web.enums.Motif;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */
@AllArgsConstructor
@NoArgsConstructor
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

	
	
}

