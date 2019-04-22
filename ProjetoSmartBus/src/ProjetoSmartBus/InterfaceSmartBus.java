package ProjetoSmartBus;

import java.util.List;

public interface InterfaceSmartBus {
	
	public Onibus criarOnibus (String horario, List<Passageiro> Passageiros) 
									throws HorarioNaoExisteException, PassageiroBloqueadException;
	
	public void verhorario (Passageiro pas, Onibus oni);
	
	public void verhorario (Passageiro pas, Onibus outroOni);

}
