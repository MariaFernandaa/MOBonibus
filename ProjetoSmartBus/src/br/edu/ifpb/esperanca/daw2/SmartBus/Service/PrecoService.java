package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.PrecosDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Precos;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

public class PrecoService implements Serializable, Service<Precos>{
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private PrecosDAO preDAO;
	
	@Override
	@TransacionalCdi
	public void save(Precos pre) {
		preDAO.save(pre);
	}

	@Override
	@TransacionalCdi
	public void update(Precos pre)  {
			preDAO.update(pre);
	}

	@Override
	@TransacionalCdi
	public void remove(Precos pre) {
		preDAO.remove(pre);
	}
	
	@Override
	public Precos getByID(long preId)  {
			return preDAO.getByID(preId);
	}

	@Override
	public List<Precos> getAll() {
			return preDAO.getAll();
	}

	

	
		
}


