package com.umsimplesrodrigo.relacoes.repositories.jpa;

import com.umsimplesrodrigo.relacoes.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
