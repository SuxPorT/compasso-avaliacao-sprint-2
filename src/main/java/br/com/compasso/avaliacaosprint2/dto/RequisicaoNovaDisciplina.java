package br.com.compasso.avaliacaosprint2.dto;

import javax.validation.constraints.NotBlank;

import br.com.compasso.avaliacaosprint2.model.Disciplina;

public class RequisicaoNovaDisciplina {
	@NotBlank
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Disciplina toDisciplina() {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		
		return disciplina;
	}
	
}
