package br.edu.ifpb.esperanca.daw2.SmartBus.Service;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.DAO.AdministradorDAO;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Administrador;
import br.edu.ifpb.esperanca.daw2.SmartBus.util.TransacionalCdi;

public class AdministradorService implements Serializable, Service<Administrador>{

	
private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private AdministradorDAO admDAO;
	
	@Override
	@TransacionalCdi
	public void save(Administrador adm) {
		adm.setSenha(hash(adm.getSenha()));
		admDAO.save(adm);
	}

	private String hash(String admword) {
		try {
			MessageDigest amd;
			amd = MessageDigest.getInstance("SHA-256");
			amd.update(admword.getBytes("UTF-8"));
			byte[] digest = amd.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return admword;
		}
	}

	@Override
	@TransacionalCdi
	public void update(Administrador adm)  {
			admDAO.update(adm);
	}

	@Override
	@TransacionalCdi
	public void remove(Administrador adm) {
		admDAO.remove(adm);
	}

	@Override
	public Administrador getByID(long admId)  {
			return admDAO.getByID(admId);
	}
	@Override
	public List<Administrador> getAll() {
			return admDAO.getAll();
	}

	

}

