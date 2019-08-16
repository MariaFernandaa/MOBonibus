package br.edu.ifpb.esperanca.daw2.SmartBus.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;

public class PassageiroTest {
	
	@Test
	void adicionarPassageiro() {
	List<Passageiro> passageiro = new ArrayList()<Passageiro>();
	for(int i = 0; i < 10 ; i++) {
	Passageiro passageiro = new Passageiro();
	passageiro.setNome("N"+(10-i));
	passageiro.add(Carlos);
	
	}
	System.out.println(passageiro);
	Collections.sort(passageiro);
	System.out.println(passageiro);

}
}
