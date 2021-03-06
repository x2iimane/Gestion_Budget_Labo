/**
 * 
 */
package com.fssm.web.services;

import java.awt.print.Pageable;
import java.util.List;

import javax.transaction.Transactional;

import com.fssm.web.entities.Laboratoire;
import com.fssm.web.entities.Membre;
import com.fssm.web.repositories.LaboratoireRepository;
import com.fssm.web.repositories.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author Imane Rafiq
19 juin 2022 Gestion_Budget_Labo
 *
 */
@Service
@Transactional
public class GestionLaboratoireServiceImp implements GestionLaboratoireService{

	@Autowired
	LaboratoireRepository laboratoireRepository;

	@Autowired
	MembreRepository membreRepository;

	@Override
	public Page<Membre> getMembresBLabo(String titreLabo, int page) {
		Pageable paging = (Pageable) PageRequest.of(page, 10);
		Laboratoire labo = laboratoireRepository.findById(titreLabo).get();
		Page<Membre> membres = membreRepository.findByLaboratoire(labo,paging);
		System.out.println(membres);
		return membres;
	}

	@Override
	public Laboratoire getLaboratoire(String idLabo) {
		Laboratoire laboratoire = laboratoireRepository.findById(idLabo).get();
		return laboratoire;
	}



	@Override
	public Page<Laboratoire> getAllLaboratoires(int page) {
		Pageable paging = (Pageable) PageRequest.of(page, 10);
		Page<Laboratoire> laboratoires = laboratoireRepository.findAll(paging);
		System.out.println(laboratoires);
		return laboratoires;
	}

	@Override
	public List<Object[]> getAllmembresLabo() {
		return null;
	}


	@Override
	public Laboratoire getLaboratoireMembre(Long idMembre) {
		Membre membre = membreRepository.findById(idMembre).get();
		return membre.getLaboratoire();
	}


	@Override
	public Laboratoire addNewLaboratoire(Laboratoire l) {
		Laboratoire laboratoire=new Laboratoire(l.getId(),l.getIntitule(),l.getTelephone(),l.getDescription());
		return laboratoireRepository.save(laboratoire);
	}

	@Override
	public void updateLaboratoire(String idLabo) {

	}

	@Override
	public Laboratoire updateLaboratoire(Laboratoire lab) {
	Laboratoire laboratoire = laboratoireRepository.findById(lab.getId()).get();
	laboratoire.setDescription(lab.getDescription());
	laboratoire.setIntitule(lab.getIntitule());
	laboratoire.setAcronyme(lab.getAcronyme());
	laboratoire.setTelephone(lab.getTelephone());
	return laboratoireRepository.save(laboratoire);

	}

	@Override
	public Laboratoire addNewLaboratoire(String id, String intitule, String acronyme, String telephone, String description) {
		return null;
	}
	@Override
	public void deleteLaboratoire(String idLabo) {
		Laboratoire laboratoire = laboratoireRepository.findById(idLabo).get();
		laboratoireRepository.delete(laboratoire);
	}

}
