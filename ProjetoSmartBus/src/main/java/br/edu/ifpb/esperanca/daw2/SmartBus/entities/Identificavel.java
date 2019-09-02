
package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

public abstract class Identificavel {
	
	
	public abstract Long getId();
	
	public abstract void setId(Long id);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Onibus other = (Onibus) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}

	

}
