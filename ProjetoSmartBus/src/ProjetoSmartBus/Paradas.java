package ProjetoSmartBus;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paradas {
	
	@id
	private int id_paradas;
	private double localização;
	private Date hora_de_chegada;
	private Date hora_de_saida;


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

}
