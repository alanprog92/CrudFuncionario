package br.edu.unyleya.alan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name", nullable = false)
	private String nome;
	@Column(name = "last_name", nullable = false)
	private String sobrenome;
	@Column(name = "email_address", nullable = false)
	private String email;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome, String email) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Funcionariov2 [v2id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email
				+ "]";
	}
	
}
