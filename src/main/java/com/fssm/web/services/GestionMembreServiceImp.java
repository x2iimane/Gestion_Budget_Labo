/**
 *
 */
package com.fssm.web.services;

import com.fssm.web.entities.Chercheur;
import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.entities.Responsable;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import com.fssm.web.repositories.LaboratoireRepository;
import com.fssm.web.repositories.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.time.LocalDate;

/**
 * @author Imane Rafiq
 * 19 juin 2022 Gestion_Budget_Labo
 */
@Service
@Transactional
public class GestionMembreServiceImp implements GestionMembreService {

    @Autowired
    MembreRepository membreRepository;
    @Autowired
    LaboratoireRepository laboratoireRepository;

    @Override
    public Page<Membre> getMembresByLabo(int page, String titreLabo) {
        Pageable paging = (Pageable) PageRequest.of(page, 10);
        Laboratoire labo = laboratoireRepository.findById(titreLabo).get();
        Page<Membre> membres = membreRepository.getMembresByLaboratoire(labo,paging);
        System.out.println(membres);
        return membres;
        //return new ResponseEntity<>(membres, HttpStatus.OK);
     //   return new ResponseEntity<>(membres, HttpStatus.OK);
    }

    @Override
    public Page<Membre> getAllmembres(int page) {
        Pageable paging = (Pageable) PageRequest.of(page, 10);
        Page<Membre> membres = membreRepository.findAll(paging);
        System.out.println(membres);
        return membres;
       // return new ResponseEntity<>(membres, HttpStatus.OK);

        //return membreRepository.findAll();
    }

    @Override
    public Membre getMembre(Long id) {
        Membre membre = membreRepository.findById(id).get();
        System.out.println(membre);
        return  membre;
      //  return new ResponseEntity<>(membre, HttpStatus.OK);
    }

    @Override
    public Membre addNewMembre(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
        Membre membre = new Chercheur();
        membre.setNom(nom);
        membre.setPrenom(prenom);
        membre.setSpecialite(specialite);
        membre.setGrade(grade);
        membre.setDateNaissance(dateNaissance);
        membreRepository.save(membre);
        return membreRepository.save(membre);
        //return ResponseEntity.ok(new MessageResponsable("Bien ajouté"));
    }

    @Override
    public Membre addNewResponsable(String nom, String prenom, Grade grade, Specialite specialite, LocalDate dateNaissance) {
        Membre membre = new Responsable();
        membre.setNom(nom);
        membre.setPrenom(prenom);
        membre.setSpecialite(specialite);
        membre.setGrade(grade);
        membre.setDateNaissance(dateNaissance);
        membreRepository.save(membre);
        return membreRepository.save(membre);
    }

    @Override
    public Membre updateMembre(Long id) {
        return null;
    }

    @Override
    public Membre updateMembre(Membre membre) {
       Membre m = membreRepository.findById(membre.getId()).get();
        m.setNom(membre.getNom());
        m.setPrenom(membre.getPrenom());
        m.setSpecialite(membre.getSpecialite());
        m.setDateNaissance(membre.getDateNaissance());
        // m.setLaboratoire(membre.getLaboratoire());
        return    membreRepository.save(m);

    }

    @Override
    public Membre updateMembreLabo(Long id, String idLabo) {
        return null;
    }

    @Override
    public Membre updateMembreLabo(Membre membre, String idLabo) {

        Membre m = membreRepository.findById(membre.getId()).get();
        Laboratoire l = laboratoireRepository.findById(idLabo).get();

        m.setNom(membre.getNom());
        m.setPrenom(membre.getPrenom());
        m.setSpecialite(membre.getSpecialite());
        m.setDateNaissance(membre.getDateNaissance());
        // m.setLaboratoire(membre.getLaboratoire());
        return    membreRepository.save(m);
    }

    @Override
    public void deleteMembre(Long id) {
        Membre m = membreRepository.findById(id).get();
        membreRepository.delete(m);
    }

    @Override
    public Membre affectMembreLabo(Long idMembre, String idLabo) {
        Membre m = membreRepository.findById(idMembre).get();
        Laboratoire l = laboratoireRepository.findById(idLabo).get();
        m.setLaboratoire(l);
        return membreRepository.save(m);
    }

}
