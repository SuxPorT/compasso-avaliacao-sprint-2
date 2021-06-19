package br.com.compasso.avaliacaosprint2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity
public class Turma {
	// @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codigo;
	private Curso codigoCurso;
	
	public void listarTurma() {
	}
	
	public void listarAlunos() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Curso getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Curso codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
}
