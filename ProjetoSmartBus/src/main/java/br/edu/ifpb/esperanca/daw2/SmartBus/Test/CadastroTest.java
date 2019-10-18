package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.CadastroService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Cadastro;

public class CadastroTest {
	
@Test
public void variacaoPreco() {

	Cadastro cad = new Cadastro ();
	cad.setId(0L);
	cad.setNome("ana");
	
	CadastroService service = new  CadastroService();
	service.save(cad);
	
	Cadastro cad2 = service.getByID(0L);
	
	assertEquals(cad2, cad);
	assertEquals("ana", cad2.getNome());
	
	cad2.setNome("bia");
	
	service.update(cad2);
	
	Cadastro cad3 = service.getByID(0L);
	
	assertEquals("paula", cad3.getNome());
	
	service.remove(cad3);
	
	Cadastro cad4 = service.getByID(0L);
	
	assertNull(cad4);
	
}

}