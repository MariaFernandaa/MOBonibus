package ProjetoSmartBus;

@Entity
public class Rodoviaria {
	@id
	private int id_rodoviaria;
	private String cronograma;
	private double localiza��o;

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

}
