package com.esprit.examen.services;

import java.util.Date;
import java.util.List;

import com.esprit.com.dto.ReglementDTO;
import com.esprit.examen.entities.Reglement;

public interface IReglementService {

	List<Reglement> retrieveAllReglements();
	Reglement addReglement(Reglement r);
	Reglement retrieveReglement(Long id);
	List<Reglement> retrieveReglementByFacture(Long idFacture);
	float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
	ReglementDTO addANDupdate2(ReglementDTO dto);
	void deleteReglement(Long id); 
	
	 public ReglementDTO retrieveReglement2( Long id);
public	List<ReglementDTO> retrieveAllReglement2();

}
