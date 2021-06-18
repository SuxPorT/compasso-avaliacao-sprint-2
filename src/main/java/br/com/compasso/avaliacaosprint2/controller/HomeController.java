package br.com.compasso.avaliacaosprint2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.compasso.avaliacaosprint2.model.Aluno;

@Controller
public class HomeController {

	@GetMapping("aluno")
	public String aluno(Model model) {
		Aluno aluno = new Aluno();
		aluno.setNome("Test 01");
		aluno.setSexo("Masculino");
		aluno.setMatricula("0001");
		
		List<Aluno> alunos = Arrays.asList(aluno);
		model.addAttribute("alunos", alunos);
		
		return "alunos";
	}
	
	@GetMapping("professor")
	public String professor(Model model) {
		return "professores";
	}
	
	@GetMapping("turma")
	public String turma(Model model) {
		return "turmas";
	}
	
	@GetMapping("curso")
	public String curso(Model model) {
		return "cursos";
	}
	
}
