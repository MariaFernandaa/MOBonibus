package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.ParadasDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.TransacionalCdi;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Paradas;

@ApplicationScoped
public class ParadasService implements Serializable, Service<Paradas> {
	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ParadasDAO parDAO;
	
	@Override
	@TransacionalCdi
	public void save(Paradas par) {
		parDAO.save(par);
	}

	@Override
	@TransacionalCdi
	public void update(Paradas par)  {
			parDAO.update(par);
	}

	@Override
	@TransacionalCdi
	public void remove(Paradas par) {
		parDAO.remove(par);
	}

	@Override
	public Paradas getByID(long parId)  {
			return parDAO.getByID(parId);
	}
	@Override
	public List<Paradas> getAll() {
			return parDAO.getAll();
	}

	
}



