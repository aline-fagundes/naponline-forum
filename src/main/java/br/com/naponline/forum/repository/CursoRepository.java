package br.com.naponline.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.naponline.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
