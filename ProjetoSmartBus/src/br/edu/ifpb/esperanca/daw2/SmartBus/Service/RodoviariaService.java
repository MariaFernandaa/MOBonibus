package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.PrecosDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.TransacionalCdi;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Precos;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Rodoviaria;

public class RodoviariaService implements Serializable, Service<Rodoviaria> {
	
	@Inject
	private RodoviariaDAO rodoDAO;
	
	@Override
	@TransacionalCdi
	public void save(Rodoviaria rodo) {
		rodoDAO.save(rodo);
	}

	@Override
	@TransacionalCdi
	public void update(Rodoviaria rodo)  {
			rodoDAO.update(rodo);
	}

	@Override
	@TransacionalCdi
	public void remove (Rodoviaria rodo) {
		rodoDAO.remove(rodo);
	}
	
	@Override
	public Rodoviaria getByID(long rodoId)  {
			return rodoDAO.getByID(rodoId);
	}

	@Override
	public List<Rodoviaria> getAll() {
			return rodoDAO.getAll();
	}




}

}
