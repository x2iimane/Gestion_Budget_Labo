/**
 * 
 */
package com.fssm.web.services;

import java.util.List;

import javax.transaction.Transactional;

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

	 
	
	public List<Object[]> getBudgetsAnneeEncours () {
		
		return null;
	}
}
