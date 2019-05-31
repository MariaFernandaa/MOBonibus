package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paradas extends Identificavel{
	
	@Id
	private Long id;
	private double localização;
	private Date hora_de_chegada;
	private Date hora_de_saida;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getLocalização() {
		return localização;
	}
	public void setLocalização(double localização) {
		this.localização = localização;
	}
	
	public Date getHora_de_chegada() {
		return hora_de_chegada;
	}
	public void setHora_de_chegada(Date hora_de_chegada) {
		this.hora_de_chegada = hora_de_chegada;
	}
	
	public Date getHora_de_saida() {
		return hora_de_saida;
	}
	public void setHora_de_saida(Date hora_de_saida) {
		this.hora_de_saida = hora_de_saida;
	}

	

}
