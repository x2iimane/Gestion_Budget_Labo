/**
 * 
 */
package com.fssm.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.DotationMembre;
import com.fssm.web.entities.Membre;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface DotationMembreRepository extends JpaRepository<DotationMembre, Integer>{

    @Query("select d from DotationMembre d where d.budget.id = :idBudget and  d.membre = :idMembre")
    DotationMembre getDotationByBudgetAndMembre(@Param("idBudget") Long idBudget, @Param("idMembre") Long idMembre);

}
