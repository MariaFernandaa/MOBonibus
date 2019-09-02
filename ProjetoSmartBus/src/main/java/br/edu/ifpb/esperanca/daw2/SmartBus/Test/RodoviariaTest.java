package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNull;

	import org.junit.Test;

	import br.edu.ifpb.esperanca.daw2.SmartBus.Service.RodoviariaService;
	import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Rodoviaria;

	public class RodoviariaTest {
		@Test
		public void AtualizacaoRodoviaria() {

			Rodoviaria ro = new Rodoviaria();
			ro.setId(0L);
			ro.setCronograma("12/09");
			ro.setLocalizacao(10);
			
			RodoviariaService service = new  RodoviariaService();
			service.save(ro);
			
			Rodoviaria ro2 = service.getByID(0L);
			
			assertEquals(ro2, ro);
			assertEquals("12/09", ro.getCronograma());
			
			ro2.setCronograma("15/09");
			ro2.setLocalizacao(6);
			
			service.update(ro2);
			
			Rodoviaria ro3 = service.getByID(0L);
			
			assertEquals("18/09", ro3.getCronograma());
			
			service.remove(ro3);
			
			Rodoviaria ro4 = service.getByID(0L);
			
			assertNull(ro4);
			
		}

	}


