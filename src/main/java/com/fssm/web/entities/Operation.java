package com.fssm.web.entities;

import com.fssm.web.enums.Etat;
import com.fssm.web.enums.TypeOperation;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Imane Rafiq
20 juin 2022 Gestion_Budget_Labo
 *
 */


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Operation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private double totalSomme;
    private TypeOperation typeOperation;
    private LocalDate dateTransact;
    private Etat etat;


    @ManyToOne
    ExpressionBesoin expressionBesoin;

    @ManyToOne
    Budget budget;


}
