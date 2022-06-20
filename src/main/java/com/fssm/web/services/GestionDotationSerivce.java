/**
 * 
 */
package com.fssm.web.services;

import com.fssm.web.entities.DotationMembre;

import java.util.List;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */
public interface GestionDotationSerivce {


    public List<DotationMembre> getDotationsMembres();

    public List<Object[]> getDotationsMembreBudget(int idMembre );
    public DotationMembre getDotationMembreBudget(int idMembre , Long idBudget);

    public DotationMembre affectDotationMembre (double somme, int idMembre, Long idBudget);

    public DotationMembre updateDotationMembre(int idDotation);




}
