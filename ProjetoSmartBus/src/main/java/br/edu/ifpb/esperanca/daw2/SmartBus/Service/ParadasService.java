
package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.ParadasDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Onibus;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Paradas;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

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
	public void remove(Paradas entidade) {
		parDAO.remove(entidade);
	}

	@Override
	public Paradas getByID(long parId)  {
			return parDAO.getByID(parId);
	}
	@Override
	public List<Paradas> getAll() {
			return parDAO.getAll();
	}

	public void remove(Onibus entidade) {
		// TODO Auto-generated method stub
		
	}

	
}



