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
19 juin 2022 Gestion_Budget_Labo
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "mobilite")
public class Mobilite extends ExpressionBesoin {
 
	private double prixBillet;
	private double fraisSejour;
	private LocalDate dateDepart;
	private LocalDate dateRetour;
	
	public LocalDate getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}
	public LocalDate getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	public double getPrixBillet() {
		return prixBillet;
	}
	public void setPrixBillet(double prixBillet) {
		this.prixBillet = prixBillet;
	}
	public double getFraisSejour() {
		return fraisSejour;
	}
	public void setFraisSejour(double fraisSejour) {
		this.fraisSejour = fraisSejour;
	}


	
	
	
}
