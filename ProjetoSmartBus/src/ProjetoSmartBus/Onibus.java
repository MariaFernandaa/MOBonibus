package ProjetoSmartBus;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Onibus {
	
	@Id
	private int id_onibus;
	private int QuantPassageiro;
	private Date horario;
	private String destino;
	
	@ManyToMany
	@JoinColumn(name = "Paradas_Onibus")
	private Set<Paradas> paradas;
	
	@ManyToMany
	@JoinColumn(name = "Precos_Onibus")
	private Set<Precos> precos;

	public Onibus(int id_onibus, int quantPassageiro, Date horario, String destino, Set<Paradas> paradas,
			Set<Precos> precos) {
		super();
		this.id_onibus = id_onibus;
		QuantPassageiro = quantPassageiro;
		this.horario = horario;
		this.destino = destino;
		this.paradas = paradas;
		this.precos = precos;
	}

	public int getId_onibus() {
		return id_onibus;
	}

	public void setId_onibus(int id_onibus) {
		this.id_onibus = id_onibus;
	}

	public int getQuantPassageiro() {
		return QuantPassageiro;
	}

	public void setQuantPassageiro(int quantPassageiro) {
		QuantPassageiro = quantPassageiro;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + QuantPassageiro;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + id_onibus;
		result = prime * result + ((paradas == null) ? 0 : paradas.hashCode());
		result = prime * result + ((precos == null) ? 0 : precos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Onibus other = (Onibus) obj;
		if (QuantPassageiro != other.QuantPassageiro)
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (id_onibus != other.id_onibus)
			return false;
		if (paradas == null) {
			if (other.paradas != null)
				return false;
		} else if (!paradas.equals(other.paradas))
			return false;
		if (precos == null) {
			if (other.precos != null)
				return false;
		} else if (!precos.equals(other.precos))
			return false;
		return true;
	}

	 Onibus criarOnibus(String string, ArrayList<Passageiro> passageiro) {
		// TODO Auto-generated method stub
		return null;
	}
	
}	