
package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Identificavel;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Onibus;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Paradas;

public interface Service<E extends Identificavel> {

		void save(E e);

		void update(E e);

		void remove(E e);
		
		E getByID(long userId);

		List<E> getAll();

	

		

	}


