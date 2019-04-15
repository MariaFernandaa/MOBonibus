package ProjetoSmartBus;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity

public class Precos {
	
	@Id
	private int id_preço;
	private int distância;
	private int inteira;
	private int meia;
	
	@ManyToMany
	@JoinColumn(name = "Rodoviaria_Precos")
	private Set<Rodoviaria> rodoviarias;

	public Precos(int id_preço, int distância, int inteira, int meia, Set<Rodoviaria> rodoviarias) {
		super();
		this.id_preço = id_preço;
		this.distância = distância;
		this.inteira = inteira;
		this.meia = meia;
		this.rodoviarias = rodoviarias;
	}

	public int getId_preço() {
		return id_preço;
	}

	public void setId_preço(int id_preço) {
		this.id_preço = id_preço;
	}

	public int getDistância() {
		return distância;
	}

	public void setDistância(int distância) {
		this.distância = distância;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distância;
		result = prime * result + id_preço;
		result = prime * result + inteira;
		result = prime * result + meia;
		result = prime * result + ((rodoviarias == null) ? 0 : rodoviarias.hashCode());
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
		Precos other = (Precos) obj;
		if (distância != other.distância)
			return false;
		if (id_preço != other.id_preço)
			return false;
		if (inteira != other.inteira)
			return false;
		if (meia != other.meia)
			return false;
		if (rodoviarias == null) {
			if (other.rodoviarias != null)
				return false;
		} else if (!rodoviarias.equals(other.rodoviarias))
			return false;
		return true;
	}
	
	

	
}