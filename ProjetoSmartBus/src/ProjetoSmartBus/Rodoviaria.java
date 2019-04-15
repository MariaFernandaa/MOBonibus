package ProjetoSmartBus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rodoviaria {
	
	@Id
	private int id_rodoviaria;
	private String cronograma;
	private double localiza��o;

	public Rodoviaria(int id_rodoviaria, String cronograma, double localiza��o) {
		super();
		this.id_rodoviaria = id_rodoviaria;
		this.cronograma = cronograma;
		this.localiza��o = localiza��o;
	}
	
	public int getId_rodoviaria() {
		return id_rodoviaria;
	}
	public void setId_rodoviaria(int id_rodoviaria) {
		this.id_rodoviaria = id_rodoviaria;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cronograma == null) ? 0 : cronograma.hashCode());
		result = prime * result + id_rodoviaria;
		long temp;
		temp = Double.doubleToLongBits(localiza��o);
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
		Rodoviaria other = (Rodoviaria) obj;
		if (cronograma == null) {
			if (other.cronograma != null)
				return false;
		} else if (!cronograma.equals(other.cronograma))
			return false;
		if (id_rodoviaria != other.id_rodoviaria)
			return false;
		if (Double.doubleToLongBits(localiza��o) != Double.doubleToLongBits(other.localiza��o))
			return false;
		return true;
	}

}
