package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.InterfaceAddress;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.edu.ifpb.esperanca.daw2.SmartBus.Bean.PassageiroBean;

public class SmartBusTeste {
	@Test
	void criarOnibus () throws HorarioNaoExisteException, PassageiroBloqueadException{
		InterfaceSmartBus s  = null;
		ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
		Onibus o = s.criarOnibus("", passageiros);
		assertNotNull (o);
		assertEquals("Teste Daw2", o.getClass());
		
	}
	
	
	@Test
	void testeVerHorario() {
		InterfaceSmartBus i = null;
		Paradas x = new Paradas();
		List<Time> horarios = i.verhorario(x, new Date());
		assertNotNull(horarios);
		
	}

}  
