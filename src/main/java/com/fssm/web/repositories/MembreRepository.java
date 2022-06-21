/**
 * 
 */
package com.fssm.web.repositories;

import com.fssm.web.entities.Laboratoire;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.Membre;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface MembreRepository extends JpaRepository<Membre, Long>{

   // List<Membre> getMembresByLaboratoire(int page, String idLabo);
    Page<Membre> getMembresByLaboratoire(Laboratoire laboratoire, org.springframework.data.domain.Pageable pageable);
}
