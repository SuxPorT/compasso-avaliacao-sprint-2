package br.com.compasso.avaliacaosprint2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome, sexo, registro;
	
	public void consultarTurma() {
	}
	
	public void lancarNotaAluno() {
	}
	
	public void realizarFrequencia() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
}
