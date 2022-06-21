package com.fssm.web.services;

import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface GestionMembreService {

    public ResponseEntity<?> getMembresByLabo(int page, String titreLabo);

    public ResponseEntity<?> getAllmembres(int page);

    public ResponseEntity<?> getMembre(Long id);

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

    public void deleteMembre(Long id);

    public Membre affectMembreLabo(int idMembre , String idLabo);



}
