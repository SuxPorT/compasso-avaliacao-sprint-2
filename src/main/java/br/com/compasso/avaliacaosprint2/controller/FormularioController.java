package br.com.compasso.avaliacaosprint2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.compasso.avaliacaosprint2.dto.*;
import br.com.compasso.avaliacaosprint2.model.Aluno;
import br.com.compasso.avaliacaosprint2.model.Curso;
import br.com.compasso.avaliacaosprint2.model.Disciplina;
import br.com.compasso.avaliacaosprint2.repository.AlunoRepository;
import br.com.compasso.avaliacaosprint2.repository.CursoRepository;
import br.com.compasso.avaliacaosprint2.repository.DisciplinaRepository;

@Controller
@RequestMapping("forms")
public class FormularioController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("novoAluno")
	public String aluno(RequisicaoNovoAluno requisicao) {		
		return "forms/novoAluno";
	}
	
	@PostMapping("novoAluno")
	public String novoAluno(@Valid RequisicaoNovoAluno requisicao, BindingResult result) {
		if (result.hasErrors()) {
			return "forms/novoAluno";
		}
		
		Aluno aluno = requisicao.toAluno();
		alunoRepository.save(aluno);
		
		return "redirect:/curso";
	}
	
	@GetMapping("novoCurso")
	public String curso(RequisicaoNovoCurso requisicao) {		
		return "forms/novoCurso";
	}
	
	@PostMapping("novoCurso")
	public String novoCurso(@Valid RequisicaoNovoCurso requisicao, BindingResult result) {
		if (result.hasErrors()) {
			return "forms/novoCurso";
		}
		
		Curso curso = requisicao.toCurso();
		cursoRepository.save(curso);
		
		return "redirect:/curso";
	}
	
	@GetMapping("novaDisciplina")
	public String disciplina(RequisicaoNovaDisciplina requisicao) {		
		return "forms/novaDisciplina";
	}
	
	@PostMapping("novaDisciplina")
	public String novaDisciplina(@Valid RequisicaoNovaDisciplina requisicao, BindingResult result) {
		if (result.hasErrors()) {
			return "forms/novaDisciplina";
		}
		
		Disciplina disciplina = requisicao.toDisciplina();
		disciplinaRepository.save(disciplina);
		
		return "redirect:/disciplina";
	}
	
}
