package ProjetoSmartBus;
@Entity

public class Pre�os {
	@id
	private int id_pre�o;
	private int dist�ncia;
	private int inteira;
	private int meia;

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

}
