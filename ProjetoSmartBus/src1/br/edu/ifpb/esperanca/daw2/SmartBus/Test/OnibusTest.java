package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.OnibusService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Onibus;

public class OnibusTest {
	@Test
	public void variacaoOnibus() {

		Onibus o = new Onibus();
		o.setId(0L);
		o.setHorario(1969-12-31);
		o.setDestino("João Pessoa");
		
		OnibusService service = new  OnibusService();
		Onibus p = null;
		service.save(p);
		
		Onibus o2 = service.getByID(0L);
		
		assertEquals(o2, o);
		assertEquals(10, o2.getHorario());
		
		o2.setHorario(2019-11-30);
		o2.setDestino("Bahia");
		
		service.update(o2);
		
		Onibus o3 = service.getByID(0L);
		
		assertEquals(2019-05-27, o3.getHorario());
		
		service.remove(o3);
		
		Onibus o4 = service.getByID(0L);
		
		assertNull(o4);
		
	}

}
