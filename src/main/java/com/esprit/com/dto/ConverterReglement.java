package com.esprit.com.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.esprit.examen.entities.Reglement;



@Component
public class ConverterReglement {


public static ReglementDTO entityToDto(Reglement reglement) {
		
	ReglementDTO dto = new ReglementDTO();
	
	dto.setIdReglement(reglement.getIdReglement());
	dto.setMontantPaye(reglement.getMontantPaye());
	dto.setMontantRestant(reglement.getMontantRestant());
	dto.setPayee(reglement.getPayee());

		return dto;
	}
	

public static  List<ReglementDTO> entityToDto(List<Reglement> reglement) {
	
	return	reglement.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	
}
   public static Reglement dtoToEntity(ReglementDTO dto)
  {
   Reglement reg = new Reglement();
   reg.setIdReglement(dto.getIdReglement());
   reg.setMontantPaye(dto.getMontantPaye());
   reg.setMontantRestant(dto.getMontantRestant());
   reg.setPayee(dto.getPayee());
   
	return reg;
	
}
   
	public List<Reglement> dtoToEntity(List<ReglementDTO> dto)
	{

		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
}
