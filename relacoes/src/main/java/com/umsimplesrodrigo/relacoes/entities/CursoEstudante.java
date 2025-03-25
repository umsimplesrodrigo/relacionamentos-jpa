package com.umsimplesrodrigo.relacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "curso_estudante")
public class CursoEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    private Curso curso;

    @ManyToMany
    @JoinColumn(name = "estudante_id", referencedColumnName = "id")
    private Estudante estudante;

    public CursoEstudante() {
    }

    public CursoEstudante(Curso curso, Estudante estudante) {
        this.curso = curso;
        this.estudante = estudante;
    }

    public CursoEstudante(int id, Curso curso, Estudante estudante) {
        this.id = id;
        this.curso = curso;
        this.estudante = estudante;
    }
}
