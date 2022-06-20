/**
 * 
 */
package com.fssm.web.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.*;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Builder
@Entity
@DiscriminatorValue("chercheur")
@Data
@Getter
@Setter
@AllArgsConstructor
public class Chercheur extends Membre{

}
