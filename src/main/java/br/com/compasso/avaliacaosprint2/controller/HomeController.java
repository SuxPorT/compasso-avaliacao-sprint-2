package br.com.compasso.avaliacaosprint2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.compasso.avaliacaosprint2.model.Aluno;
import br.com.compasso.avaliacaosprint2.model.Curso;
import br.com.compasso.avaliacaosprint2.model.Disciplina;
import br.com.compasso.avaliacaosprint2.model.Professor;
import br.com.compasso.avaliacaosprint2.model.Turma;

import br.com.compasso.avaliacaosprint2.repository.*;

@Controller
public class HomeController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	// @Autowired
	// private ProfessorRepository professorRepository;
	
	// @Autowired
	// private TurmaRepository turmaRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@GetMapping("aluno")
	public String aluno(Model model) {
		List<Aluno> alunos = alunoRepository.findAll();
		model.addAttribute("alunos", alunos);
		
		return "alunos";
	}
	
	@GetMapping("professor")
	public String professor(Model model) {
		// List<Professor> professores = professorRepository.findAll();
		// model.addAttribute("professores", professores);
		
		return "professores";
	}
	
	@GetMapping("turma")
	public String turma(Model model) {
		// List<Turma> turmas = turmaRepository.findAll();
		// model.addAttribute("turmas", turmas);
		
		return "turmas";
	}
	
	@GetMapping("curso")
	public String curso(Model model) {
		List<Curso> cursos = cursoRepository.findAll();
		model.addAttribute("cursos", cursos);
		
		return "cursos";
	}
	
	@GetMapping("disciplina")
	public String disciplina(Model model) {
		List<Disciplina> disciplinas = disciplinaRepository.findAll();
		model.addAttribute("disciplinas", disciplinas);
		
		return "disciplinas";
	}
	
}
