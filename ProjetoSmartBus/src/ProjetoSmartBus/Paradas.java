package ProjetoSmartBus;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paradas {
	
	@Id
	private int id_paradas;
	private double localização;
	private Date hora_de_chegada;
	private Date hora_de_saida;

	public Paradas(int id_paradas, double localização, Date hora_de_chegada, Date hora_de_saida) {
		super();
		this.id_paradas = id_paradas;
		this.localização = localização;
		this.hora_de_chegada = hora_de_chegada;
		this.hora_de_saida = hora_de_saida;
	}
	
	public int getId_paradas() {
		return id_paradas;
	}
	public void setId_paradas(int id_paradas) {
		this.id_paradas = id_paradas;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora_de_chegada == null) ? 0 : hora_de_chegada.hashCode());
		result = prime * result + ((hora_de_saida == null) ? 0 : hora_de_saida.hashCode());
		result = prime * result + id_paradas;
		long temp;
		temp = Double.doubleToLongBits(localização);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Paradas other = (Paradas) obj;
		if (hora_de_chegada == null) {
			if (other.hora_de_chegada != null)
				return false;
		} else if (!hora_de_chegada.equals(other.hora_de_chegada))
			return false;
		if (hora_de_saida == null) {
			if (other.hora_de_saida != null)
				return false;
		} else if (!hora_de_saida.equals(other.hora_de_saida))
			return false;
		if (id_paradas != other.id_paradas)
			return false;
		if (Double.doubleToLongBits(localização) != Double.doubleToLongBits(other.localização))
			return false;
		return true;
	}

}
