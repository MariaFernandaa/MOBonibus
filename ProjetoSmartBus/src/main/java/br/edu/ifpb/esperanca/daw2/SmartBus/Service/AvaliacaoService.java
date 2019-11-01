package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.AvaliacaoDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Avaliacao;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

public class AvaliacaoService implements Serializable, Service<Avaliacao>  {
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AvaliacaoDAO aDAO;
	
	@Override
	@TransacionalCdi
	public void save(Avaliacao a) {
		aDAO.save(a);
	}

	@Override
	@TransacionalCdi
	public void update(Avaliacao a)  {
			aDAO.update(a);
	}

	@Override
	@TransacionalCdi
	public void remove(Avaliacao a) {
		aDAO.remove(a);
	}

	@Override
	public Avaliacao getByID(long aId)  {
			return aDAO.getByID(aId);
	}
	@Override
	public List<Avaliacao> getAll() {
			return aDAO.getAll();
	}

}
