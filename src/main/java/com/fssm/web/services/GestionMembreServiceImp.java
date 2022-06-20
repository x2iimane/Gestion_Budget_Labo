/**
 * 
 */
package com.fssm.web.services;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionMembreServiceImp implements GestionMembreService {

    @Override
    public List<Membre> getMembresByLabo(String titreLabo) {
        return null;
    }

    @Override
    public List<Membre> getAllmembres() {
        return null;
    }

    @Override
    public Membre getMembre(int id) {
        return null;
    }

    @Override
    public Membre addNewMembre(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
        return null;
    }

    @Override
    public Membre updateMembre(Long id) {
        return null;
    }

    @Override
    public Membre updateMembreLabo(Long id, String idLabo) {
        return null;
    }

    @Override
    public void deleteMembre(Long id) {

    }

    @Override
    public Membre affectMembreLabo(int idMembre, String idLabo) {
        return null;
    }

}
