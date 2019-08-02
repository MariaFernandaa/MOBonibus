package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import br.edu.ifpb.esperanca.daw2.SmartBus.entities.*;
import br.edu.ifpb.esperanca.daw2.SmartBus.Service.*;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class OnibusBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Onibus Onibus = null;

	@Inject
	private OnibusService service;

	protected Onibus entidade;

	protected Collection<Onibus> entidades;

	public OnibusBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Onibus entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Onibus getEntidade() {
		return Onibus;
	}

	public void setEntidade(Onibus entidade) {
		this.entidade = entidade;
	}

	public Collection<Onibus> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Onibus> entidades) {
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

	protected Onibus newEntidade() {
		return new Onibus();
	}

	public OnibusService getService() {
		return service;
	}


}
