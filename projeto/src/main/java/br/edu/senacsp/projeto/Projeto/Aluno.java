package br.edu.senacsp.projeto.Projeto;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity(name = "Aluno")
public class Aluno implements Serializable {

    
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="RA")
    int ra;


    @Column (name="Nome")
    String nome;
    LocalDateTime dataCadastro;

    public Aluno(String nome,LocalDateTime data){
        this.nome=nome;
        this.dataCadastro=data;
    }

    
}
