/**
 * 
 */
package com.fssm.web.services;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.ExpressionBesoin;
import com.fssm.web.entities.Membre;
import com.fssm.web.entities.Operation;
import com.fssm.web.enums.Etat;
import com.fssm.web.enums.Motif;
import com.fssm.web.enums.TypeOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionExpressionBesoinServiceImp implements GestionExpressionBesoinService {

	@Override
	public ExpressionBesoin effectuerExpressionBesoin(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, String type) {
		return null;
	}

	@Override
	public ExpressionBesoin exprimerNewAchat(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, String designation, int nbArticles) {
		return null;
	}

	@Override
	public ExpressionBesoin exprimerNewMobilite(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, double prixBillet, double fraisSejour, LocalDate dateDepart, LocalDate dateRetour) {
		return null;
	}

	@Override
	public ExpressionBesoin exprimerewInscription(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, double fraisInscription, String intituleEvenement, LocalDate dateEvenement) {
		return null;
	}

	@Override
	public ExpressionBesoin getExpressionBesoinById(Long idExpBesoin) {
		return null;
	}

	@Override
	public List<ExpressionBesoin> getExpressionsMembre(int idMembre) {
		return null;
	}

	@Override
	public List<Object[]> getAllExpressionMembresLabo() {
		return null;
	}

	@Override
	public List<Object[]> getExpressionMembresByLabo(String idLabo) {
		return null;
	}

	@Override
	public Operation validerExpressionBesoin(Long idExBesoin, Boolean etatValide, Long budgetId, double totalSomme, TypeOperation typeOperation, LocalDate dateTransact, Etat etat) {
		return null;
	}
}
