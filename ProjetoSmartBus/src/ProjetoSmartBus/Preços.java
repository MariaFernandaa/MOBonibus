package ProjetoSmartBus;
@Entity

public class Preços {
	@id
	private int id_preço;
	private int distância;
	private int inteira;
	private int meia;

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

}
