package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.*;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.*;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class PassageiroBean implements Serializable {
	
	@Inject
	private PassageiroService Passageiro;

	protected Passageiro passageiro;

	protected Collection<Passageiro> entidades;

	public PassageiroBean() {
	}
	
	@PostConstruct
	public void init() {
		Passageiro = newPassageiro ();
		entidades = getPassageiroService().getAll();
	}

	public void remove(Passageiro passageiro) {
		getService().remove(passageiro);
		limpar();
	}

	public Passageiro getEntidade() {
		return passageiro;
	}

	public void setEntidade(PassageiroBean entidade) {
		this.passageiro = passageiro;
	}

	public Collection<Passageiro> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Passageiro> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(passageiro);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		passageiro = newEntidade();
	}

	protected Passageiro newEntidade() {
		return new Passageiro();
	}

	public PassageiroService getService() {
		return PasageiroService;
	}

}
