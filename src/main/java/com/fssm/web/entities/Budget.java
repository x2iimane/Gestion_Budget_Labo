/**
 * 
 */
package com.fssm.web.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Imane Rafiq 19 juin 2022 Gestion_Budget_Labo
 *
 */
@Entity

@Data @NoArgsConstructor @AllArgsConstructor
public class Budget {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// private String anneeCivile;
	private double sommeDisponible;
	
	private double dotationBase;
	private double dotationRecherche;
	
	@ManyToOne
	private AnneeCivile anneeCivile;


	@OneToMany(mappedBy = "budget", fetch = FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	List<DotationMembre> dotationMembres =new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laboratoire_id", referencedColumnName = "id")
    private Laboratoire laboratoire;

	@OneToMany(mappedBy = "budget", fetch = FetchType.LAZY)
	List<Operation> operations =new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSommeDisponible() {
		return sommeDisponible;
	}

	public void setSommeDisponible(double sommeDisponible) {
		this.sommeDisponible = sommeDisponible;
	}

	public double getDotationBase() {
		return dotationBase;
	}

	public void setDotationBase(double dotationBase) {
		this.dotationBase = dotationBase;
	}

	public double getDotationRecherche() {
		return dotationRecherche;
	}

	public void setDotationRecherche(double dotationRecherche) {
		this.dotationRecherche = dotationRecherche;
	}

	public AnneeCivile getAnneeCivile() {
		return anneeCivile;
	}

	public void setAnneeCivile(AnneeCivile anneeCivile) {
		this.anneeCivile = anneeCivile;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public Budget(double sommeDisponible, double dotationBase, double dotationRecherche, AnneeCivile anneeCivile,
			Laboratoire laboratoire) {
		super();
		this.sommeDisponible = sommeDisponible;
		this.dotationBase = dotationBase;
		this.dotationRecherche = dotationRecherche;
		this.anneeCivile = anneeCivile;
		this.laboratoire = laboratoire;
	}


	
	

}
