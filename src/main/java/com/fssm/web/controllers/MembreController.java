/**
 * 
 */
package com.fssm.web.controllers;

import com.fssm.web.entities.Membre;
import com.fssm.web.payload.response.MessageResponse;
import com.fssm.web.services.GestionMembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    //@PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getMembresByLabo(@RequestParam("page") int page) {
        return gestionMembreService.getAllmembres(page);
    }
    @GetMapping("/listeMembresLabo/{id}")
    //@PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getMembresByLabo(@RequestParam("page") int page , @PathVariable String titreLabo) {
            return gestionMembreService.getMembresByLabo(page,titreLabo);
    }

    @PostMapping("/addMembreChercheur")
   // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> addNewMembre(@RequestBody Membre m) {
        if (gestionMembreService.addNewMembre(m.getNom(),m.getPrenom(),
                m.getGrade(),m.getSpecialite(),m.getDateNaissance()) != null)
        return ResponseEntity.ok(new MessageResponse("Bien ajouté"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

    @PutMapping("/updateMembre")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> updateMembre(@RequestBody Membre m) {
        if (gestionMembreService.updateMembre(m) != null)
            return ResponseEntity.ok(new MessageResponse("Bien modifié"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

}
