
package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.PassageiroService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;

public class PassageiroTest {
	@Test
	public void variacaoPreco() {

		Passageiro pa = new Passageiro();
		pa.setId(0L);
		pa.setNome("ana");
		
		PassageiroService service = new  PassageiroService();
		service.save(pa);
		
		Passageiro pa2 = service.getByID(0L);
		
		assertEquals(pa2, pa);
		assertEquals("ana", pa2.getNome());
		
		pa2.setNome("bia");
		
		service.update(pa2);
		
		Passageiro pa3 = service.getByID(0L);
		
		assertEquals("paula", pa3.getNome());
		
		service.remove(pa3);
		
		Passageiro pa4 = service.getByID(0L);
		
		assertNull(pa4);
		
	}

}
