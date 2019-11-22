package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.AvaliacaoService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Avaliacao;

@ViewScoped
@Named
public class AvaliacaoBean implements Serializable  {
	
	@Inject
	private AvaliacaoService service;

	protected Avaliacao entidade;

	protected Collection<Avaliacao> entidades;

	public AvaliacaoBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Avaliacao entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Avaliacao getEntidade() {
		return entidade;
	}

	public void setEntidade(Avaliacao entidade) {
		this.entidade = entidade;
	}

	public Collection<Avaliacao> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Avaliacao> entidades) {
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

	protected Avaliacao newEntidade() {
		return new Avaliacao();
	}

	public AvaliacaoService getService() {
		return service;
	}

}

