
package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.PassageiroDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

@ApplicationScoped
public class PassageiroService  implements Serializable, Service<Passageiro>{

	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private PassageiroDAO passDAO;
	
	@Override
	@TransacionalCdi
	public void save(Passageiro pass) {
		pass.setSenha(hash(pass.getSenha()));
		passDAO.save(pass);
	}

	private String hash(String password) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return password;
		}
	}

	@Override
	@TransacionalCdi
	public void update(Passageiro pass)  {
			passDAO.update(pass);
	}

	@Override
	@TransacionalCdi
	public void remove(Passageiro pass) {
		passDAO.remove(pass);
	}

	@Override
	public Passageiro getByID(long passId)  {
			return passDAO.getByID(passId);
	}
	@Override
	public List<Passageiro> getAll() {
			return passDAO.getAll();
	}

	

}
