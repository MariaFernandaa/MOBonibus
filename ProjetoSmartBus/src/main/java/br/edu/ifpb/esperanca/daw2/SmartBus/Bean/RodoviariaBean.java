package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.RodoviariaService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Rodoviaria;

public class RodoviariaBean {
	
	@Inject
	private RodoviariaService service;

	protected Rodoviaria entidade;

	protected Collection<Rodoviaria> entidades;

	public RodoviariaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Rodoviaria entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Rodoviaria getEntidade() {
		return entidade;
	}

	public void setEntidade(Rodoviaria entidade) {
		this.entidade = entidade;
	}

	public Collection<Rodoviaria> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Rodoviaria> entidades) {
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

	protected Rodoviaria newEntidade() {
		return new Rodoviaria();
	}

	public RodoviariaService getService() {
		return service;
	}

}
