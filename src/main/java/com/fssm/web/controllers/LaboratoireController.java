package com.fssm.web.controllers;


import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.services.GestionLaboratoireService;
import com.fssm.web.services.GestionLaboratoireServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaboratoireController {

    @Autowired
    GestionLaboratoireService gestionLaboratoireService;

    @GetMapping("/laboratoire/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getMembre(@PathVariable String id) {
        Laboratoire laboratoire = gestionLaboratoireService.getLaboratoire(id);
        return new ResponseEntity<>(laboratoire, HttpStatus.OK);
    }
}
