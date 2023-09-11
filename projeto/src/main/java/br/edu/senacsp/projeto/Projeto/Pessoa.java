package br.edu.senacsp.projeto.Projeto;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Pessoa")

public class Pessoa implements Serializable{

    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    int id;

    @Column(name = "Nome")
    String nome;

    @Column(name = "email")
    String email;

    @Column(name = "cpf")
    String cpf;
    LocalDateTime dataCadastro;
    
}

