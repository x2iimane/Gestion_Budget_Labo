/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.Budget;
import com.fssm.web.entities.Laboratoire;

import java.util.List;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */

public interface GestionBudgetService {

    public Budget addNewBudget(double sommeDisponible, double dotationBase,
							   double dotationRecherche, AnneeCivile anneeCivile,
                               Laboratoire laboratoire);

	public Budget updateBudget(Long id);

	public Budget deleteBudget(Long id);

	public Budget getBudgetAnneeLabo(String idAnnee, String idLabo);

	public List<Object[]> getBudgetsLabo(String idLabo);


}
