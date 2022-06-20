/**
 * 
 */
package com.fssm.web.services;

import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.DotationMembre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionDotationServiceImp implements GestionDotationSerivce {

	 
	
	public List<Object[]> getBudgetsAnneeEncours () {
		
		return null;
	}

	@Override
	public DotationMembre getDotationMembreBudget(int idMembre, Long idBudget) {
		return null;
	}

	@Override
	public List<DotationMembre> getDotationsMembres() {
		return null;
	}

	@Override
	public List<Object[]> getDotationsMembreBudget(int idMembre) {
		return null;
	}

	@Override
	public DotationMembre affectDotationMembre(double somme, int idMembre, Long idBudget) {
		return null;
	}

	@Override
	public DotationMembre updateDotationMembre(int idDotation) {
		return null;
	}
}
