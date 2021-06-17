package br.com.compasso.avaliacaosprint2.model;

import java.util.Date;

public class Aluno {

	private String nome, sexo, matricula;
	private Date dataNascimento;
	
	public void registrarAluno() {
	}
	
	public void consultarAluno() {
	}
	
	public void excluirAluno() {
	}
	
	public void alterarMatricula() {
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
