/**
 * 
 */
package com.fssm.web.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@DiscriminatorValue(value = "achat")
public class Achat extends ExpressionBesoin{
	
	//@Column()
	private double somme = 0;
	//private int quantite;
	private String designation;
	private int nbArticles;
	public double getSomme() {
		return somme;
	}
	public void setSomme(double somme) {
		this.somme = somme;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNbArticles() {
		return nbArticles;
	}
	public void setNbArticles(int nbArticles) {
		this.nbArticles = nbArticles;
	}

	
	
	
	
}
