package ProjetoSmartBus;

import java.util.List;

public interface InterfaceSmartBus {
	
	public Onibus criarOnibus (String horario, List<Passageiro> Passageiros) 
									throws HorarioNaoExisteException, PassageiroBloqueadException;
	
	public void verhorario (Passageiro pas, Onibus oni);
	
	
	public void verpreco (Passageiro pas, Onibus oni);
	
	
	public void verdestino (Onibus oni, Passageiro pas);
	
	
	public void verparadas (Onibus oni, Paradas par, Passageiro pas);

}
