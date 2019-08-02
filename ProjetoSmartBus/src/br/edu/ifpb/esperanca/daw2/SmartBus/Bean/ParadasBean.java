package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import br.edu.ifpb.esperanca.daw2.SmartBus.Service.ParadasService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Paradas;

public class ParadasBean {

	private static final Paradas Paradas = null;

	@Inject
	private ParadasService service;

	protected Paradas entidade;

	protected Collection<Paradas> entidades;

	public ParadasBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Paradas entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Paradas getEntidade() {
		return Paradas;
	}

	public void setEntidade(Paradas entidade) {
		this.entidade = entidade;
	}

	public Collection<Paradas> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Paradas> entidades) {
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

	protected Paradas newEntidade() {
		return new Paradas();
	}

	public ParadasService getService() {
		return service;
	}


}


