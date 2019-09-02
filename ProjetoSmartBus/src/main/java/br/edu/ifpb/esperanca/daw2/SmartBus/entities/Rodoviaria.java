package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rodoviaria extends Identificavel {
	
	@Id
	private Long id;
	private String cronograma;
	private double localizacao;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCronograma() {
		return cronograma;
	}
	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}
	
	public double getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(double localizacao) {
		this.localizacao = localizacao;
	}


	

}
