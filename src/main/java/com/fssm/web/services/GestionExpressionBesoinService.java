/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.*;
import com.fssm.web.enums.Etat;
import com.fssm.web.enums.Motif;
import com.fssm.web.enums.TypeOperation;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Imane Rafiq
 * 20 juin 2022 Gestion_Budget_Labo
 */

public interface GestionExpressionBesoinService {

    Operation validerExpressionBesoin(ExpressionBesoin expressionBesoin, Budget budjet, double totalSomme, TypeOperation typeOperation, LocalDate dateTransact);

    public ExpressionBesoin effectuerExpressionBesoin(Motif motif, String description,
                                                      LocalDate createdAt,
                                                      LocalDate updatedAt,
                                                      Membre membre,
                                                      AnneeCivile anneeCivile, String type);

    ExpressionBesoin effectuerExpressionBesoin(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, String type);

    public ExpressionBesoin exprimerNewAchat(Motif motif, String description,
                                             LocalDate createdAt,
                                             LocalDate updatedAt,
                                             Membre membre,
                                             AnneeCivile anneeCivile,
                                             String designation,
                                             int nbArticles);

    ExpressionBesoin exprimerNewAchat(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, String designation, int nbArticles);

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

    ExpressionBesoin exprimerNewMobilite(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, double prixBillet, double fraisSejour, LocalDate dateDepart, LocalDate dateRetour);

    public ExpressionBesoin exprimerewInscription(Motif motif, String description,
                                                  LocalDate createdAt,
                                                  LocalDate updatedAt,
                                                  Membre membre,
                                                  AnneeCivile anneeCivile,
                                                  double fraisInscription,
                                                  String intituleEvenement,
                                                  LocalDate dateEvenement
    );

    ExpressionBesoin exprimerewInscription(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, double fraisInscription, String intituleEvenement, LocalDate dateEvenement);

    public ExpressionBesoin getExpressionBesoinById(Long idExpBesoin);

    public List<ExpressionBesoin> getExpressionsMembre(int idMembre);

    Page<ExpressionBesoin> getExpressionsMembre(Membre Membre, int page);

    public List<Object[]> getAllExpressionMembresLabo();

    public List<Object[]> getExpressionMembresByLabo(String idLabo);

    public Operation validerExpressionBesoin(Long idExBesoin, Boolean etatValide,
                                             Long budgetId, double totalSomme,
                                             TypeOperation typeOperation,
                                             LocalDate dateTransact,
                                             Etat etat
    );

}
