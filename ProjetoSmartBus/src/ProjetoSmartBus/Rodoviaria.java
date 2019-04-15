package ProjetoSmartBus;

@Entity
public class Rodoviaria {
	@id
	private int id_rodoviaria;
	private String cronograma;
	private double localização;

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
	
	public double getLocalização() {
		return localização;
	}
	public void setLocalização(double localização) {
		this.localização = localização;
	}

}
