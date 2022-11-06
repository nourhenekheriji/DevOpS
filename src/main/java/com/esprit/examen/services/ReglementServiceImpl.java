package com.esprit.examen.services;

import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Reglement;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.repositories.ReglementRepository;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
public class ReglementServiceImpl implements IReglementService {

	@Autowired
	FactureRepository factureRepository;
	@Autowired
	ReglementRepository reglementRepository;
	@Override
	public List<Reglement> retrieveAllReglements() {
		List<Reglement> reglements= (List<Reglement>) reglementRepository.findAll();
		try {
			log.info("In Method retrieveAllReglements :");

			reglements = (List<Reglement>) reglementRepository.findAll();

			log.info("out of Method retrieveAllReglements with succes");
		}catch (Exception e) {
			log.error("out of Method retrieveAllReglements with Errors + e");
		}

		return reglements;
	}



	@Override
	public Reglement addReglement(Reglement r) {
		List<Reglement> reglements = (List<Reglement>) reglementRepository.findAll();
		try {
			log.info("In Method addReglement :");



			log.info("out of Method addReglement with succes");
		}catch (Exception e) {
			log.error("out of Method addReglement with Errors + e");
		}

		return	reglementRepository.save(r);

	}

	@Override
	public Reglement retrieveReglement(Long id) {

		Reglement reglement = reglementRepository.findById(id).orElse(null);
		log.info("reglement :"+ reglement);
		return reglement;
	}

	@Override
	public List<Reglement> retrieveReglementByFacture(Long idFacture) {

		Reglement reglement = reglementRepository.findById(idFacture).orElse(null);
		return (List<Reglement>) reglement.getFacture();
	}

	@Override
	public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
		return reglementRepository.getChiffreAffaireEntreDeuxDate( startDate, endDate);
	}
	
	
	@Override
	public void deleteReglement(Long id) {
		reglementRepository.deleteById(id);
		
	}


	
	


	
}
