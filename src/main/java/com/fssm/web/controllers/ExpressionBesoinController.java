/**
 *
 */
package com.fssm.web.controllers;

import com.fssm.web.entities.ExpressionBesoin;
import com.fssm.web.enums.TypeOperation;
import com.fssm.web.payload.response.MessageResponse;
import com.fssm.web.services.GestionExpressionBesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * @author Imane Rafiq
 * 20 juin 2022 Gestion_Budget_Labo
 */

@RestController
public class ExpressionBesoinController {

    @Autowired
    GestionExpressionBesoinService gestionExpressionBesoinService;

    @PutMapping("/validerExpressionBesoin")
    @PreAuthorize("hasRole('RESPONSABE')")
    public ResponseEntity<?> validerExpressionBesoin(@RequestBody ExpressionBesoin expressionBesoin,
                                                     @RequestBody double totalSomme, @RequestBody TypeOperation typeOperation, @RequestBody LocalDate dateTransact) {
        if (gestionExpressionBesoinService.validerExpressionBesoin(expressionBesoin,
                totalSomme, typeOperation, dateTransact) != null)
            return ResponseEntity.ok(new MessageResponse("Bien validé"));
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
}
