/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.AnneeCivile;
import com.fssm.web.entities.ExpressionBesoin;
import com.fssm.web.entities.Membre;
import com.fssm.web.entities.Operation;
import com.fssm.web.enums.Etat;
import com.fssm.web.enums.Motif;
import com.fssm.web.enums.TypeOperation;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Imane Rafiq
 * 20 juin 2022 Gestion_Budget_Labo
 */

public interface GestionExpressionBesoinService {

    public ExpressionBesoin effectuerExpressionBesoin(Motif motif, String description,
                                                      LocalDate createdAt,
                                                      LocalDate updatedAt,
                                                      Membre membre,
                                                      AnneeCivile anneeCivile, String type);

    public ExpressionBesoin exprimerNewAchat(Motif motif, String description,
                                             LocalDate createdAt,
                                             LocalDate updatedAt,
                                             Membre membre,
                                             AnneeCivile anneeCivile,
                                             String designation,
                                             int nbArticles);

    public ExpressionBesoin exprimerNewMobilite(Motif motif, String description,
                                                LocalDate createdAt,
                                                LocalDate updatedAt,
                                                Membre membre,
                                                AnneeCivile anneeCivile,
                                                double prixBillet,
                                                double fraisSejour,
                                                LocalDate dateDepart,
                                                LocalDate dateRetour
    );

    public ExpressionBesoin exprimerewInscription(Motif motif, String description,
                                                  LocalDate createdAt,
                                                  LocalDate updatedAt,
                                                  Membre membre,
                                                  AnneeCivile anneeCivile,
                                                  double fraisInscription,
                                                  String intituleEvenement,
                                                  LocalDate dateEvenement
    );

    public ExpressionBesoin getExpressionBesoinById(Long idExpBesoin);

    public List<ExpressionBesoin> getExpressionsMembre(int idMembre);

    public List<Object[]> getAllExpressionMembresLabo();

    public List<Object[]> getExpressionMembresByLabo(String idLabo);

    public Operation validerExpressionBesoin(Long idExBesoin, Boolean etatValide,
                                             Long budgetId, double totalSomme,
                                             TypeOperation typeOperation,
                                             LocalDate dateTransact,
                                             Etat etat
    );

}
