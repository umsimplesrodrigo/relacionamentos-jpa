package com.umsimplesrodrigo.relacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detalhe_professor")
public class DetalheProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "linkedin")
    private String linkedin;

    public DetalheProfessor() {
    }

    public DetalheProfessor(String hobby, String linkedin) {
        this.hobby = hobby;
        this.linkedin = linkedin;
    }

    public DetalheProfessor(int id, String hobby, String linkedin) {
        this.id = id;
        this.hobby = hobby;
        this.linkedin = linkedin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
}
