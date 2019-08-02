package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rodoviaria extends Identificavel {
	
	@Id
	private Long id;
	private String cronograma;
	private double localiza��o;

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
	
	public double getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(double localiza��o) {
		this.localiza��o = localiza��o;
	}


	

}
