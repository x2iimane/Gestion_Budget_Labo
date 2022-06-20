/**
 * 
 */
package com.fssm.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.Membre;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Repository
public interface AnneeCivileRepository extends JpaRepository<AnneeCivile, String>{

}
