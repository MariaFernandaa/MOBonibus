package ProjetoSmartBus;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity

public class Precos {
	
	@Id
	private int id_pre�o;
	private int dist�ncia;
	private int inteira;
	private int meia;
	
	@ManyToMany
	@JoinColumn(name = "Rodoviaria_Precos")
	private Set<Rodoviaria> rodoviarias;

	public Precos(int id_pre�o, int dist�ncia, int inteira, int meia, Set<Rodoviaria> rodoviarias) {
		super();
		this.id_pre�o = id_pre�o;
		this.dist�ncia = dist�ncia;
		this.inteira = inteira;
		this.meia = meia;
		this.rodoviarias = rodoviarias;
	}

	public int getId_pre�o() {
		return id_pre�o;
	}

	public void setId_pre�o(int id_pre�o) {
		this.id_pre�o = id_pre�o;
	}

	public int getDist�ncia() {
		return dist�ncia;
	}

	public void setDist�ncia(int dist�ncia) {
		this.dist�ncia = dist�ncia;
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
		result = prime * result + dist�ncia;
		result = prime * result + id_pre�o;
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
		if (dist�ncia != other.dist�ncia)
			return false;
		if (id_pre�o != other.id_pre�o)
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