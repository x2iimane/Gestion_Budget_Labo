/**
 * 
 */
package com.fssm.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.Membre;

import java.util.List;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface MembreRepository extends JpaRepository<Membre, Long>{

    List<Membre> getMembresByLaboratoire(String idLabo);
}
