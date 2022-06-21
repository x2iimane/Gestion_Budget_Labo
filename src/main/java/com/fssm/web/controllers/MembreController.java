/**
 * 
 */
package com.fssm.web.controllers;

import com.fssm.web.entities.Membre;
import com.fssm.web.payload.response.MessageResponse;
import com.fssm.web.services.GestionMembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */

@RestController
@RequestMapping("/api/membre")
public class MembreController {

    @Autowired
    GestionMembreService gestionMembreService;

    @GetMapping("/listeMembres")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getAllMembres(@RequestParam("page") int page) {
        Page<Membre> membres = gestionMembreService.getAllmembres(page);
        return new ResponseEntity<>(membres, HttpStatus.OK);
    }
    @GetMapping("/listeMembresLabo/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getMembresByLabo(@RequestParam("page") int page , @PathVariable String titreLabo) {

        Page<Membre> membres = gestionMembreService.getMembresByLabo(page,titreLabo);
        return new ResponseEntity<>(membres, HttpStatus.OK);

    }

    @PostMapping("/addMembreChercheur")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> addNewMembre(@RequestBody Membre m) {
        if (gestionMembreService.addNewMembre(m.getNom(),m.getPrenom(),
                m.getGrade(),m.getSpecialite(),m.getDateNaissance()) != null)
        return ResponseEntity.ok(new MessageResponse("Bien ajouté"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

    @PutMapping("/updateMembre")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> updateMembre(@RequestBody Membre m) {
        if (gestionMembreService.updateMembre(m) != null)
            return ResponseEntity.ok(new MessageResponse("Bien modifié"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

    @PutMapping("/affectLaboMembre")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> affectLaboMembre(@RequestBody Long idMembre , @RequestBody String idLabo) {
        if (gestionMembreService.affectMembreLabo(idMembre,idLabo) != null)
            return ResponseEntity.ok(new MessageResponse("Bien affcté"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }




}
