package br.com.compasso.avaliacaosprint2.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import br.com.compasso.avaliacaosprint2.model.Aluno;

public class RequisicaoNovoAluno {
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sexo;
	
	@NotBlank
	private String matricula;
	
	@NotBlank
	private Date dataNascimento;

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
	
	public Aluno toAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setSexo(sexo);
		aluno.setMatricula(matricula);
		aluno.setDataNascimento(dataNascimento);
		
		return aluno;
	}
	
}
