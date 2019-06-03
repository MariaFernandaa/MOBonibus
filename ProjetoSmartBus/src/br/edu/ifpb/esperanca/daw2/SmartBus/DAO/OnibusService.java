package br.edu.ifpb.esperanca.daw2.SmartBus.DAO;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Onibus;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;

@ApplicationScoped
public class OnibusService implements Serializable, Service<Onibus>{
	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private OnibusDAO oniDAO;
	
	@Override
	@TransacionalCdi
	public void save(Onibus oni) {
		oniDAO.save(oni);
	}

	@Override
	@TransacionalCdi
	public void update(Onibus oni)  {
			oniDAO.update(oni);
	}

	@Override
	@TransacionalCdi
	public void remove(Onibus oni) {
		oniDAO.remove(oni);
	}

	@Override
	public Onibus getByID(long oniId)  {
			return oniDAO.getByID(oniId);
	}

	

}

