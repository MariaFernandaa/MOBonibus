package br.edu.ifpb.esperanca.daw2.SmartBus.Service;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.CadastroDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Cadastro;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

@ApplicationScoped
public class CadastroService  implements Serializable, Service<Cadastro>{

	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private CadastroDAO cadDAO;
	
	@Override
	@TransacionalCdi
	public void save(Cadastro cad) {
		cad.setSenha(hash(cad.getSenha()));
		cadDAO.save(cad);
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
	public void update(Cadastro cad)  {
			cadDAO.update(cad);
	}

	@Override
	@TransacionalCdi
	public void remove(Cadastro cad) {
		cadDAO.remove(cad);
	}

	@Override
	public Cadastro getByID(long cadId)  {
			return cadDAO.getByID(cadId);
	}
	@Override
	public List<Cadastro> getAll() {
			return cadDAO.getAll();
	}

	

}
