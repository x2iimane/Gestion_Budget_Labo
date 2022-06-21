package com.fssm.web.services;

import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

public interface GestionMembreService {

    public Page<Membre> getMembresByLabo(int page, String titreLabo);

    public Page<Membre> getAllmembres(int page);

    public Membre getMembre(Long id);

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

    Membre updateMembre(Membre membre);

    public Membre updateMembreLabo(Long id, String idLabo);

    Membre updateMembreLabo(Membre membre, String idLabo);

    public void deleteMembre(Long id);

    public Membre affectMembreLabo(Long idMembre , String idLabo);



}
