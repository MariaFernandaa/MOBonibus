
package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity

public class Precos extends Identificavel {
	
	@Id
	private Long id;
	private int distancia;
	private int inteira;
	private int meia;
	
	@ManyToMany
	@JoinColumn(name = "Rodoviaria_Precos")
	private Set<Rodoviaria> rodoviarias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getInteira() {
		return inteira;
	}

	public void setInteira(int inteira) {
		this.inteira = inteira;
	}

	public int getMeia() {
		return meia;
	}

	public void setMeia(int meia) {
		this.meia = meia;
	}

	public Set<Rodoviaria> getRodoviarias() {
		return rodoviarias;
	}

	public void setRodoviarias(Set<Rodoviaria> rodoviarias) {
		this.rodoviarias = rodoviarias;
	}


	
}