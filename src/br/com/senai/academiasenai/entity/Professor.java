package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {

	private Integer ID;
	private String nomeCompleto;
	private LocalDate dataDeCasamento;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public LocalDate getDataDeCasamento() {
		return dataDeCasamento;
	}
	public void setDataDeCasamento(LocalDate dataDeCasamento) {
		this.dataDeCasamento = dataDeCasamento;
	}

	
}
