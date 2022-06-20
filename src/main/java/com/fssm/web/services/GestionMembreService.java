package com.fssm.web.services;

import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;

import java.time.LocalDate;
import java.util.List;

public interface GestionMembreService {

    public List<Membre> getMembresByLabo(String titreLabo);

    public List<Membre> getAllmembres();

    public Membre getMembre(int id);

    public Membre addNewMembre(String nom,
                               String prenom,
                               Grade grade,
                               Specialite specialite,
                               LocalDate dateNaissance
    );
    public Membre addNewResponsable(String nom,
                               String prenom,
                               Grade grade,
                               Specialite specialite,
                               LocalDate dateNaissance
    );
    public Membre updateMembre(Long id);

    public Membre updateMembreLabo(Long id, String idLabo);

    public void deleteMembre(Long id);

    public Membre affectMembreLabo(int idMembre , String idLabo);



}
