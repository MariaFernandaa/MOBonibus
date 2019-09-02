
package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.PrecoService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Precos;

public class PrecosTest {

	@Test
	public void variacaoPreco() {

		Precos p = new Precos();
		p.setId(0L);
		p.setInteira(10);
		p.setMeia(5);
		p.setDistancia(10);
		
		PrecoService service = new  PrecoService();
		service.save(p);
		
		Precos p2 = service.getByID(0L);
		
		assertEquals(p2, p);
		assertEquals(10, p2.getInteira());
		
		p2.setInteira(12);
		p2.setMeia(6);
		
		service.update(p2);
		
		Precos p3 = service.getByID(0L);
		
		assertEquals(12, p3.getInteira());
		
		service.remove(p3);
		
		Precos p4 = service.getByID(0L);
		
		assertNull(p4);
		
	}
}
