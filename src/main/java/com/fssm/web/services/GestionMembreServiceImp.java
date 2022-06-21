/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import com.fssm.web.repositories.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionMembreServiceImp implements GestionMembreService {

    @Autowired
    MembreRepository membreRepository;

    @Override
    public List<Membre> getMembresByLabo(String titreLabo) {
        return membreRepository.getMembresByLaboratoire(titreLabo);
    }

    @Override
    public List<Membre> getAllmembres() {
        return membreRepository.findAll();
    }

    @Override
    public Membre getMembre(Long id) {
        return membreRepository.findById(id).get();
    }

    @Override
    public Membre addNewMembre(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
        return null;
    }

    @Override
    public Membre addNewResponsable(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
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
