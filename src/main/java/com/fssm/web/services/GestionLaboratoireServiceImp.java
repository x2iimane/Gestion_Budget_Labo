/**
 * 
 */
package com.fssm.web.services;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.enums.Grade;
import com.fssm.web.enums.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionLaboratoireServiceImp implements GestionLaboratoireService{

	@Override
	public List<Membre> getMembresBLabo(String titreLabo) {
		return null;
	}

	@Override
	public Laboratoire getLaboratoire(String idLabo) {
		return null;
	}

	@Override
	public List<Laboratoire> getAllLaboratoires() {
		return null;
	}

	@Override
	public List<Object[]> getAllmembresLabo() {
		return null;
	}

	@Override
	public Laboratoire addNewLaboratoire(String id, String intitule, String acronyme, String telephone, String description) {
		return null;
	}

	@Override
	public void updateLaboratoire(String idLabo) {

	}

	@Override
	public void deleteLaboratoire(String idLabo) {

	}

}
