package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;
import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.CadastroService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Cadastro;

@ViewScoped
@Named
public class CadastroBean implements Serializable {
	
	@Inject
	private CadastroService service;

	protected Cadastro entidade;

	protected Collection<Cadastro> entidades;

	public CadastroBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Cadastro entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Cadastro getEntidade() {
		return entidade;
	}

	public void setEntidade(Cadastro entidade) {
		this.entidade = entidade;
	}

	public Collection<Cadastro> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Cadastro> entidades) {
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

	protected Cadastro newEntidade() {
		return new Cadastro();
	}

	public CadastroService getService() {
		return service;
	}

}