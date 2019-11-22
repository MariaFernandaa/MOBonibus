package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.AdministradorService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Administrador;

@ViewScoped
@Named
public class AdministradorBean implements Serializable {
	
	@Inject
	private AdministradorService service;

	protected Administrador entidade;

	protected Collection<Administrador> entidades;

	public AdministradorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Administrador entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Administrador getEntidade() {
		return entidade;
	}

	public void setEntidade(Administrador entidade) {
		this.entidade = entidade;
	}

	public Collection<Administrador> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Administrador> entidades) {
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

	protected Administrador newEntidade() {
		return new Administrador ();
	}

	public AdministradorService getService() {
		return service;
	}

}