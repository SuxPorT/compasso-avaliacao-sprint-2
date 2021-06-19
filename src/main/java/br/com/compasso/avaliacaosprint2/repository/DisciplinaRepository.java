package br.com.compasso.avaliacaosprint2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.avaliacaosprint2.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

	List<Disciplina> findByCodigo(String codigo);
	List<Disciplina> findByNome(String nome);
}
