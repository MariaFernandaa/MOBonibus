package br.edu.ifpb.esperanca.daw2.SmartBus.entities;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Avaliacao extends Identificavel {

	
	@Id
	@GeneratedValue(generator="avaliacao_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="avaliacao_seq")
	private Long id;
	private String arCodicionado;
	private String horario;
	private String assentos;
	private String motorista;
	
	@ManyToMany
	@JoinColumn(name = "Onibus_Avaliacao")
	private Set<Onibus> onibus;
	private String arCondicionado;
	public Long getId() {
		return id;
	}

	public void setId(Long id_avaliacao) {
		this.id = id_avaliacao;
	}

	public String getarCondicionado () {
		return getarCondicionado();
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getAssentos() {
		return assentos;
	}

	public void setAssentos(String assentos) {
		this.assentos = assentos;
	}

	public Set<Onibus> getOnibus() {
		return onibus;
	}

	public void setParadas(Set<Onibus> onibus) {
		this.onibus = onibus;
	}
	
	public String getMotorista() {
		return assentos;
	}

	public void setMotorista(String motorista) {
		this.assentos = motorista;
	}


	
}