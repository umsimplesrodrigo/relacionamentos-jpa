package com.umsimplesrodrigo.relacoes.repositories.jpa;

import com.umsimplesrodrigo.relacoes.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
}
