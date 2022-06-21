package com.fssm.web.controllers;


import com.fssm.web.entities.Laboratoire;
import com.fssm.web.payload.response.MessageResponse;
import com.fssm.web.services.GestionLaboratoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/laboratoires")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getAllLaboratoires(@RequestParam("page") int page) {
        Page<Laboratoire> laboratoires = gestionLaboratoireService.getAllLaboratoires(page);
        return new ResponseEntity<>(laboratoires, HttpStatus.OK);
    }

    @GetMapping("/laboratoireMembre/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> getLaboratoireMembre(@PathVariable Long id) {
        Laboratoire laboratoire = gestionLaboratoireService.getLaboratoireMembre(id);
        return new ResponseEntity<>(laboratoire, HttpStatus.OK);
    }

    @PostMapping("/addLaboratoire")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> addNewLaboratoire(@RequestBody Laboratoire lab) {
        if ((gestionLaboratoireService.addNewLaboratoire(lab))
                != null)
            return ResponseEntity.ok(new MessageResponse("Bien ajouté"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

    @PutMapping("/updateLabo")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> updateLaboratoire(@RequestBody Laboratoire lab) {
        if ((gestionLaboratoireService.updateLaboratoire(lab))
                != null)
            return ResponseEntity.ok(new MessageResponse("Bien modifié"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
    @DeleteMapping("/deleteLabo/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasRole('RESPONSABLE')")
    public ResponseEntity<?> updateLaboratoire(@PathVariable String id) {
        gestionLaboratoireService.deleteLaboratoire(id);
        return ResponseEntity.ok(new MessageResponse("Bien supprimé"));
    }
}
