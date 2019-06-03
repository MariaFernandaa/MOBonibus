package br.edu.ifpb.esperanca.daw2.SmartBus.DAO;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;
@ApplicationScoped
public class PassageiroService  implements Serializable, Service<Passageiro>{
	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private PassageiroDAO userDAO;
	
	@Override
	@TransacionalCdi
	public void save(Passageiro pass) {
		userDAO.save(pass);
	}

	@Override
	@TransacionalCdi
	public void update(Passageiro pass)  {
			userDAO.update(pass);
	}

	@Override
	@TransacionalCdi
	public void remove(Passageiro pass) {
		userDAO.remove(pass);
	}

	@Override
	public Passageiro getByID(long passId)  {
			return userDAO.getByID(passId);
	}

	

}
