package br.com.compasso.avaliacaosprint2.dto;

import javax.validation.constraints.NotBlank;

import br.com.compasso.avaliacaosprint2.model.Curso;

public class RequisicaoNovoCurso {
	@NotBlank
	private String codigo;
	
	@NotBlank
	private String nome;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Curso toCurso() {
		Curso curso = new Curso();
		curso.setCodigo(codigo);
		curso.setNome(nome);
		
		return curso;
	}
	
}
