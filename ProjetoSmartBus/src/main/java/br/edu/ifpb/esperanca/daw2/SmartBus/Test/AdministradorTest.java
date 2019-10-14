package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.AdministradorService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Administrador;

public class AdministradorTest {
	@Test
	public void variacaoPreco() {

		Administrador adm = new Administrador();
		adm.setId(0L);
		adm.setNome("ana");
		
		AdministradorService service = new  AdministradorService();
		service.save(adm);
		
		Administrador adm2 = service.getByID(0L);
		
		assertEquals(adm2, adm);
		assertEquals("ana", adm2.getNome());
		
		adm2.setNome("bia");
		
		service.update(adm2);
		
		Administrador adm3 = service.getByID(0L);
		
		assertEquals("paula", adm3.getNome());
		
		service.remove(adm3);
		
		Administrador adm4 = service.getByID(0L);
		
		assertNull(adm4);
		
	}

}
