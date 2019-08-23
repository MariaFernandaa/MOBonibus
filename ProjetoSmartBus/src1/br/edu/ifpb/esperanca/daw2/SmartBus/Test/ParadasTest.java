package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.ParadasService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Paradas;

public class ParadasTest {
	@Test
	public void variacaoParadas() {

		Paradas pr = new Paradas();
		pr.setId(0L);
		pr.setLocaliza��o(10);
		
		ParadasService service = new  ParadasService();
		service.save(pr);
		
		Paradas pr2 = service.getByID(0L);
		
		assertEquals(pr2, pr);
		assertEquals(10, pr2.getLocaliza��o());
		
		pr2.setLocaliza��o(12);
		
		service.update(pr2);
		
		Paradas pr3 = service.getByID(0L);
		
		assertEquals(12, pr3.getLocaliza��o());
		
		service.remove(pr3);
		
		Paradas pr4 = service.getByID(0L);
		
		assertNull(pr4);
		
	}

}
