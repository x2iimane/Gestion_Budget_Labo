/**
 * 
 */
package com.fssm.web.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.ExpressionBesoin;
import com.fssm.web.entities.Membre;

import java.awt.print.Pageable;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface ExpressionBesoinRepository extends JpaRepository<ExpressionBesoin, Long>{

    Page<ExpressionBesoin> findByMembre(Membre membre, Pageable pageable);
}
