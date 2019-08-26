package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paradas extends Identificavel{
	
	@Id
	private Long id;
	private double localiza��o;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar hora_de_chegada;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar hora_de_saida;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(double localiza��o) {
		this.localiza��o = localiza��o;
	}
	
	public Calendar getHora_de_chegada() {
		return hora_de_chegada;
	}
	public void setHora_de_chegada(Calendar hora_de_chegada) {
		this.hora_de_chegada = hora_de_chegada;
	}
	
	public Calendar getHora_de_saida() {
		return hora_de_saida;
	}
	public void setHora_de_saida(Calendar hora_de_saida) {
		this.hora_de_saida = hora_de_saida;
	}

	

}
