package com.fssm.web.services;

import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;

import java.time.LocalDate;
import java.util.List;

public interface GestionMembreService {

    public List<Membre> getMembresByLabo(String titreLabo);

    public List<Object[]> getAllmemebresLabo();

    public Membre AddNewMembre(String nom,
                               String prenom,
                               Grade grade,
                               Specialite specialite,
                               LocalDate dateNaissance
    );

    public Membre UpdateMembre(Long id);

    public void DeleteMembre(Long id);

    public Membre AffectMembreLabo(int idMembre , String idLabo);



}
