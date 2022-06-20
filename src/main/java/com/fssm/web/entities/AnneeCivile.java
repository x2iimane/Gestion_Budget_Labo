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
 * @author Imane Rafiq 19 juin 2022 Gestion_Budget_Labo
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnneeCivile {

	@Id
	private String intitule;
	private boolean anneeEncours;

	@OneToMany(mappedBy = "anneeCivile", fetch = FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Budget> budgets = new ArrayList<Budget>();

	@OneToMany(mappedBy = "anneeCivile", fetch = FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<DotationMembre> dotationMembre = new ArrayList<DotationMembre>();

	@OneToMany(mappedBy = "anneeCivile", fetch = FetchType.LAZY)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ExpressionBesoin> expressionBesoins = new ArrayList<ExpressionBesoin>();


	public List<Budget> getBudgets() {
		return budgets;
	}

	public void setBudgets(List<Budget> budgets) {
		this.budgets = budgets;
	}

	public List<DotationMembre> getDotationMembre() {
		return dotationMembre;
	}

	public void setDotationMembre(List<DotationMembre> dotationMembre) {
		this.dotationMembre = dotationMembre;
	}

	public List<ExpressionBesoin> getExpressionBesoins() {
		return expressionBesoins;
	}

	public void setExpressionBesoins(List<ExpressionBesoin> expressionBesoins) {
		this.expressionBesoins = expressionBesoins;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public boolean isAnneeEncours() {
		return anneeEncours;
	}

	public void setAnneeEncours(boolean anneeEncours) {
		this.anneeEncours = anneeEncours;
	}

}
