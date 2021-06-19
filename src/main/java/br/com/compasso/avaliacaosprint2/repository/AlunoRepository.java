package br.com.compasso.avaliacaosprint2.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compasso.avaliacaosprint2.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	List<Aluno> findByNome(String nome);
	List<Aluno> findByMatricula(String matricula);
	List<Aluno> findByDataNascimento(Date dataNascimento);
}
