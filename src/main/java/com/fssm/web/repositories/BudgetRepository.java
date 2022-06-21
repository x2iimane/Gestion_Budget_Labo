/**
 * 
 */
package com.fssm.web.repositories;

import com.fssm.web.entities.DotationMembre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.Budget;
import com.fssm.web.entities.Membre;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long>{

   }
