 
package br.edu.ifpb.esperanca.daw2.SmartBus.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Passageiro extends Identificavel {
	
	@Id
	@GeneratedValue(generator="passageiro_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="passageiro_seq")
	private Long id;
	private String nome;
	private Date idade;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getIdade() {
		return idade;
	}
	public void setIdade(Date	 idade) {
		this.idade = idade;
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
