/**
 * 
 */
package com.fssm.web.controllers;

import com.fssm.web.entities.Membre;
import com.fssm.web.services.GestionMembreService;
import org.springframework.beans.factory.annotation.Autowired;
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


}
