package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Precos;

public class PrecosTest {
	
	@Test
	Precos p = new Precos();
	p.setPreco(0.60);
	p.setPreco(1.75);
	p.setPreco(3.50);
	p.calculaPrecos();
	assertEquals(70, p.getPrecos());
	
	Precos a2 = new Aluno();
	a2.setNota(2, 70);
	try {
	a2.calculaMedia();
	fail();
	} catch (FaltaNotaException e) {}
		
	
}
