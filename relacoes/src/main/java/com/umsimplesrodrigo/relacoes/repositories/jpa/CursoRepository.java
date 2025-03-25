package com.umsimplesrodrigo.relacoes.repositories.jpa;

import com.umsimplesrodrigo.relacoes.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
