package br.com.compasso.avaliacaosprint2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.compasso.avaliacaosprint2.model.Disciplina;
import br.com.compasso.avaliacaosprint2.repository.DisciplinaRepository;

@Controller
@RequestMapping("/disciplina")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;
	
	@GetMapping
	public String disciplina(Model model) {
		Disciplina d1 = new Disciplina(), d2 = new Disciplina();
		d1.setNome("Algoritmos");
		d1.setCodigo("123");
		
		d2.setNome("Estrutura de Dados");
		d2.setCodigo("321");
		
		List<Disciplina> test = repository.findAll();
		
		//System.out.println(test);
		
		List<Disciplina> disciplinas = Arrays.asList(d1, d2);
		model.addAttribute("disciplinas", disciplinas);
		
		return "disciplinas";
	}
	
}
