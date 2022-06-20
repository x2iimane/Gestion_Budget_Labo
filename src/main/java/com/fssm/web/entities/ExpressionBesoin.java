/**
 * 
 */
package com.fssm.web.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fssm.web.enums.Motif;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpressionBesoin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Motif motif;
	private String description;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private boolean EtatValide;

	public ExpressionBesoin(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt,
			boolean etatValide, Membre membre, AnneeCivile anneeCivile) {
		super();
		this.motif = motif;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		EtatValide = etatValide;
		this.membre = membre;
		this.anneeCivile = anneeCivile;
	}

	public boolean isEtatValide() {
		return EtatValide;
	}

	public void setEtatValide(boolean etatValide) {
		EtatValide = etatValide;
	}

	@ManyToOne
	Membre membre;
	
	@ManyToOne
	AnneeCivile anneeCivile;

	@OneToMany(mappedBy = "expressionBesoin", fetch = FetchType.LAZY)
	List<Operation> operations =new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public AnneeCivile getAnneeCivile() {
		return anneeCivile;
	}

	public void setAnneeCivile(AnneeCivile anneeCivile) {
		this.anneeCivile = anneeCivile;
	}



	public ExpressionBesoin(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre,
			AnneeCivile anneeCivile) {
		super();
		this.motif = motif;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.membre = membre;
		this.anneeCivile = anneeCivile;
	}
	
	
	
}
