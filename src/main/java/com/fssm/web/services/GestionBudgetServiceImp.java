/**
 * 
 */
package com.fssm.web.services;

import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.Budget;
import com.fssm.web.entities.Laboratoire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionBudgetServiceImp implements GestionBudgetService{

	@Override
	public Budget addNewBudget(double sommeDisponible, double dotationBase, double dotationRecherche, AnneeCivile anneeCivile, Laboratoire laboratoire) {
		return null;
	}

	@Override
	public Budget updateBudget(Long id) {
		return null;
	}

	@Override
	public Budget deleteBudget(Long id) {
		return null;
	}

	@Override
	public Budget getBudgetAnneeLabo(String idAnnee, String idLabo) {
		return null;
	}

	@Override
	public List<Object[]> getBudgetsLabo(String idLabo) {
		return null;
	}
}
