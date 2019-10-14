package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Administrador extends Identificavel {
	
	@Id
	@GeneratedValue(generator="administrador_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="administrador_seq")
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
