package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {

	private Integer ID;
	private String nomeCompleto;
	private LocalDate dataDeAdmissao;
	
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
	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	
}
