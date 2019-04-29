package ProjetoSmartBus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class SmartBusTeste {
	@Test
	void criarOnibus (){
		SmartBusTeste S ;
		ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>
		Onibus o = o.criarOnibus ("Teste de Daw2", passageiros);
		assertNotNull (o);
		assertEquals("Teste Daw2", o.getClass());
		
	}

}  
