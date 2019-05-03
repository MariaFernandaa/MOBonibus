package ProjetoSmartBus;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface InterfaceSmartBus {
	
	public Onibus criarOnibus (String horario, List<Passageiro> Passageiros) 
									throws HorarioNaoExisteException, PassageiroBloqueadException;
	
	public List<Time> verhorario (Paradas x, Date data);
	
	
	public double verpreco (Paradas x);
	
	

	
	
	public void verparadas (Onibus oni, Paradas par, Passageiro pas);

}
