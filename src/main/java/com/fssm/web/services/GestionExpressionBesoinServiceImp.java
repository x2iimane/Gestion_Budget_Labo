/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.*;
import com.fssm.web.enums.Etat;
import com.fssm.web.enums.Motif;
import com.fssm.web.enums.TypeOperation;
import com.fssm.web.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Imane Rafiq
 * 19 juin 2022 Gestion_Budget_Labo
 */
@Service
@Transactional
public class GestionExpressionBesoinServiceImp implements GestionExpressionBesoinService {

    @Autowired
    ExpressionBesoinRepository expressionBesoinRepository;

    @Autowired
    MembreRepository membreRepository;

    @Autowired
    AnneeCivileRepository anneeCivileRepository;

    @Autowired
    BudgetRepository budgetRepository;

    @Autowired
    OperationRepository operationRepository;

    @Autowired
    DotationMembreRepository dotationMembreRepository;

    @Override
    public ExpressionBesoin effectuerExpressionBesoin(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, String type) {
        Membre m = membreRepository.findById(membre.getId()).get();
        AnneeCivile anneeCiv = anneeCivileRepository.findById(anneeCivile.getIntitule()).get();
        if ((anneeCivile.isAnneeEncours()) && (m != null)) {
            if (type.equals("achat")) {
                Achat a = new Achat();
                //a.setDescription(expressionBesoin.setDescription());
                a.setMembre(membre);
                a.setAnneeCivile(anneeCiv);
                a.setEtatValide(false);
                // a=expressionBesoin;
                expressionBesoinRepository.save(expressionBesoin);
                expressionBesoinRepository.save(a);
            }
            return expressionBesoin;
        }
        return null;
    }

    @Override
    public ExpressionBesoin exprimerNewAchat(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, String designation, int nbArticles) {
        return null;
    }

    @Override
    public ExpressionBesoin exprimerNewAchat(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, String designation, int nbArticles) {
        Membre m = membreRepository.findById(membre.getId()).get();
        AnneeCivile anneeCiv = anneeCivileRepository.findById(anneeCivile.getIntitule()).get();
        if ((anneeCivile.isAnneeEncours()) && (m != null)) {
            Achat a = new Achat();
            a.setDescription(expressionBesoin.getDescription());
            a.setMotif(expressionBesoin.getMotif());
            a.setUpdatedAt(expressionBesoin.getUpdatedAt());
            a.setCreatedAt(expressionBesoin.getCreatedAt());
            a.setMembre(membre);
            a.setAnneeCivile(anneeCiv);
            a.setEtatValide(false);
            a.setDesignation(designation);
            a.setNbArticles(nbArticles);
            // a=expressionBesoin;
            return expressionBesoinRepository.save(a);
        }
        return null;
    }
    @Override
    public Operation validerExpressionBesoin(ExpressionBesoin expressionBesoin, double totalSomme, TypeOperation typeOperation, LocalDate dateTransact) {
        ExpressionBesoin exp = expressionBesoinRepository.findById(expressionBesoin.getId()).get();
       AnneeCivile anneeCivile = anneeCivileRepository.findByAnneeEncours(true);
        Budget budget = budgetRepository.findByAnneeCivile(anneeCivile);
        DotationMembre dotationMembre = dotationMembreRepository.getDotationByBudgetAndMembre(budget.getId(), (exp.getMembre().getId()));
        if ((dotationMembre.getSomme() >= totalSomme) && (budget.getSommeDisponible() >= totalSomme)) {
            budget.setSommeDisponible(budget.getSommeDisponible() - totalSomme);
            budgetRepository.save(budget);
            dotationMembre.setSomme(dotationMembre.getSomme() - totalSomme);
            dotationMembre.setBudget(budget);
            dotationMembreRepository.save(dotationMembre);
            Operation operation = new Operation();
            operation.setExpressionBesoin(exp);
            operation.setTypeOperation(typeOperation);
            operation.setBudget(budget);
            operation.setDateTransact(dateTransact);
            operation.setTotalSomme(totalSomme);
            expressionBesoinRepository.save(exp);
            operationRepository.save(operation);
            return operation;
        }
        return null;
    }

    @Override
    public ExpressionBesoin exprimerNewMobilite(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, double prixBillet, double fraisSejour, LocalDate dateDepart, LocalDate dateRetour) {
        return null;
    }

    @Override
    public ExpressionBesoin exprimerNewMobilite(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, double prixBillet, double fraisSejour, LocalDate dateDepart, LocalDate dateRetour) {
        Membre m = membreRepository.findById(membre.getId()).get();
        AnneeCivile anneeCiv = anneeCivileRepository.findById(anneeCivile.getIntitule()).get();
        if ((anneeCiv.isAnneeEncours()) && (m != null)) {
            Mobilite a = new Mobilite();
            a.setDescription(expressionBesoin.getDescription());
            a.setMotif(expressionBesoin.getMotif());
            a.setUpdatedAt(expressionBesoin.getUpdatedAt());
            a.setCreatedAt(expressionBesoin.getCreatedAt());
            a.setMembre(membre);
            a.setAnneeCivile(anneeCiv);
            a.setEtatValide(false);
            a.setPrixBillet(prixBillet);
            a.setDateDepart(dateDepart);
            a.setDateRetour(dateRetour);
            a.setFraisSejour(fraisSejour);
            // a=expressionBesoin;
            return expressionBesoinRepository.save(a);
        }
        return null;
    }

    @Override
    public ExpressionBesoin exprimerewInscription(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, double fraisInscription, String intituleEvenement, LocalDate dateEvenement) {
        return null;
    }

    @Override
    public ExpressionBesoin exprimerewInscription(ExpressionBesoin expressionBesoin, Membre membre, AnneeCivile anneeCivile, double fraisInscription, String intituleEvenement, LocalDate dateEvenement) {
        Membre m = membreRepository.findById(membre.getId()).get();
        if ((anneeCivile.isAnneeEncours()) && (m != null)) {
            Inscription a = new Inscription();
            a.setDescription(expressionBesoin.getDescription());
            a.setMotif(expressionBesoin.getMotif());
            a.setUpdatedAt(expressionBesoin.getUpdatedAt());
            a.setCreatedAt(expressionBesoin.getCreatedAt());
            a.setMembre(membre);
            a.setAnneeCivile(anneeCivile);
            a.setEtatValide(false);
            a.setFraisInscription(fraisInscription);
            a.setIntituleEvenement(intituleEvenement);
            a.setDateEvenement(dateEvenement);
            // a=expressionBesoin;
            return expressionBesoinRepository.save(a);
        }
        return null;
    }

    @Override
    public ExpressionBesoin getExpressionBesoinById(Long idExpBesoin) {
        ExpressionBesoin expressionBesoin = expressionBesoinRepository.findById(idExpBesoin).get();
        return expressionBesoin;
    }

    @Override
    public List<ExpressionBesoin> getExpressionsMembre(int idMembre) {
        return null;
    }

    @Override
    public Page<ExpressionBesoin> getExpressionsMembre(Membre Membre, int page) {
        Pageable paging = (Pageable) PageRequest.of(page, 10);
        Page<ExpressionBesoin> expressionBesoins = expressionBesoinRepository.findByMembre(Membre, paging);
        System.out.println(expressionBesoins);
        return expressionBesoins;

    }

    @Override
    public List<Object[]> getAllExpressionMembresLabo() {
        return null;
    }

    @Override
    public List<Object[]> getExpressionMembresByLabo(String idLabo) {
        return null;
    }

    @Override
    public Operation validerExpressionBesoin(Long idExBesoin, Boolean etatValide, Long budgetId, double totalSomme, TypeOperation typeOperation, LocalDate dateTransact, Etat etat) {
        return null;
    }


    @Override
    public Operation validerExpressionBesoin(ExpressionBesoin expressionBesoin, Budget budjet, double totalSomme, TypeOperation typeOperation, LocalDate dateTransact) {
        return null;
    }

    @Override
    public ExpressionBesoin effectuerExpressionBesoin(Motif motif, String description, LocalDate createdAt, LocalDate updatedAt, Membre membre, AnneeCivile anneeCivile, String type) {
        return null;
    }
}
