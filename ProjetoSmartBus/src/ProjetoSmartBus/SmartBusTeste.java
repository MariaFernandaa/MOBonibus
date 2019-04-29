package ProjetoSmartBus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class SmartBusTeste {
	@Test
	void criarOnibus () throws HorarioNaoExisteException, PassageiroBloqueadException{
		InterfaceSmartBus S ;
		ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
		Onibus o = S.criarOnibus("", passageiros);
		assertNotNull (o);
		assertEquals("Teste Daw2", o.getClass());
		
	}

}  
