package ProjetoSmartBus;
import java.sql.Date;
@Entity

public class Onibus {
	@id
	private int id_onibus;
	private int QuantPassageiro;
	private Date horario;
	private String destino;
//
// @ManyToMany
// @JoinColum
//public ArrayList<Reservatorio> possui; 
	
	

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
	
	