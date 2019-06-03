package br.edu.ifpb.esperanca.daw2.SmartBus.DAO;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Onibus;
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

	

}


}
