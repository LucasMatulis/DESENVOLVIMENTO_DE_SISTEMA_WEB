package br.com.curso.faculdade.resource;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Aluno")
public class Aluno implements Serializable{

    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column(name = "Nome")
    String nome;
    LocalDateTime dataCadastro;
    
}
