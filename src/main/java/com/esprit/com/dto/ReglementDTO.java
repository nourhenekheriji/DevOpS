package com.esprit.com.dto;

public class ReglementDTO {
	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;

	public ReglementDTO(Long idReglement, float montantPaye, float montantRestant, Boolean payee) {
		super();
		this.idReglement = idReglement;
		this.montantPaye = montantPaye;
		this.montantRestant = montantRestant;
		this.payee = payee;
	}

	public ReglementDTO() {
		super();
	
	}
	
	public Long getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(Long idReglement) {
		this.idReglement = idReglement;
	}
	public float getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}
	public float getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}
	public Boolean getPayee() {
		return payee;
	}
	public void setPayee(Boolean payee) {
		this.payee = payee;
	}
	
	
	
	

}
