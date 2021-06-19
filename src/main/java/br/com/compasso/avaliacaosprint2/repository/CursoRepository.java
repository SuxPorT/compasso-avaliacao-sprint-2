package br.com.compasso.avaliacaosprint2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compasso.avaliacaosprint2.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	List<Curso> findByCodigo(String codigo);
	List<Curso> findByNome(String nome);
}
