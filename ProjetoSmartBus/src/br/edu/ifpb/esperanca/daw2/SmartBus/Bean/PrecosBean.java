	package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.SmartBus.Service.PrecoService;
import br.edu.ifpb.esperanca.daw2.SmartBus.entities.Precos;

public class PrecosBean implements Serializable {
		
		@Inject
		private PrecoService service;

		protected Precos entidade;

		protected Collection<Precos> entidades;

		public PrecosBean() {
		}
		
		@PostConstruct
		public void init() {
			entidade = newEntidade();
			entidades = getService().getAll();
		}

		public void remove(Precos entidade) {
			getService().remove(entidade);
			limpar();
		}

		public Precos getEntidade() {
			return entidade;
		}

		public void setEntidade(Precos entidade) {
			this.entidade = entidade;
		}

		public Collection<Precos> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Precos> entidades) {
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

		protected Precos newEntidade() {
			return new Precos();
		}

		public PrecoService getService() {
			return service;
		}

	}


	


