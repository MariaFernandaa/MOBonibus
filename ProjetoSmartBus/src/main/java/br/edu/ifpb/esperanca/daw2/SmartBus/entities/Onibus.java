package br.edu.ifpb.esperanca.daw2.SmartBus.entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Onibus extends Identificavel {
	
	@Id
	private Long id;
	private int quantPassageiro;
	private int horario;
	private String destino;
	
	@ManyToMany
	@JoinColumn(name = "Paradas_Onibus")
	private Set<Paradas> paradas;
	
	@ManyToMany
	@JoinColumn(name = "Precos_Onibus")
	private Set<Precos> precos;

	public Long getId() {
		return id;
	}

	public void setId(Long id_onibus) {
		this.id = id_onibus;
	}

	public int getQuantPassageiro() {
		return quantPassageiro;
	}

	public void setQuantPassageiro(int quantPassageiro) {
		this.quantPassageiro = quantPassageiro;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int i) {
		this.horario = i;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Set<Paradas> getParadas() {
		return paradas;
	}

	public void setParadas(Set<Paradas> paradas) {
		this.paradas = paradas;
	}

	public Set<Precos> getPrecos() {
		return precos;
	}

	public void setPrecos(Set<Precos> precos) {
		this.precos = precos;
	}

	
}	