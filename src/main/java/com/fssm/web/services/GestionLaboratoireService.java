/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */

public interface GestionLaboratoireService {
    public Page<Membre> getMembresBLabo(String titreLabo, int page);

    public Laboratoire getLaboratoire(String idLabo);

    public List<Laboratoire> getAllLaboratoires();

    public List<Object[]> getAllmembresLabo();

    public Laboratoire getLaboratoireMembre(int idMembre);

    public Laboratoire addNewLaboratoire(String id,
                                         String intitule,
                                         String acronyme,
                                         String telephone,
                                         String description
    );

    public void updateLaboratoire(String idLabo);


    public void deleteLaboratoire(String idLabo);

}
