package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.AvaliacaoService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Avaliacao;

public class AvaliacaoTest {
	@Test
	public void variacaoAvaliacao() {
		Avaliacao a = new Avaliacao();
		a.setId(0L);
		a.setHorario("Não gostei");
		
		AvaliacaoService service = new  AvaliacaoService();
		Avaliacao p = null;
		service.save(p);
		Avaliacao p2 = service.getByID(0L);
		assertEquals(p, p2);
		service.remove(p2);
		p2 = service.getByID(0L);
		assertNull(p2);
	}

}
