/**
 * 
 */
package com.fssm.web.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "responsable")
@Data
public class Responsable extends Membre{

	
}
