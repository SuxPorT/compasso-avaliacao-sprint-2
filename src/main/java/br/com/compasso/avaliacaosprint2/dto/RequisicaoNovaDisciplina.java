package br.com.compasso.avaliacaosprint2.dto;

import javax.validation.constraints.NotBlank;

import br.com.compasso.avaliacaosprint2.model.Disciplina;

public class RequisicaoNovaDisciplina {
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

	public Disciplina toDisciplina() {
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo(codigo);
		disciplina.setNome(nome);
		
		return disciplina;
	}
	
}
