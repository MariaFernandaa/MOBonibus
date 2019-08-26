package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.PassageiroService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Passageiro;

public class PassageiroBean implements Serializable {
	
	@Inject
	private PassageiroService service;

	protected Passageiro entidade;

	protected Collection<Passageiro> entidades;

	public PassageiroBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Passageiro entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Passageiro getEntidade() {
		return entidade;
	}

	public void setEntidade(Passageiro entidade) {
		this.entidade = entidade;
	}

	public Collection<Passageiro> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Passageiro> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Passageiro newEntidade() {
		return new Passageiro();
	}

	public PassageiroService getService() {
		return service;
	}

}