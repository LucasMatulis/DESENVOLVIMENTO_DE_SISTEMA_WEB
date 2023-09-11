package br.edu.senacsp.projeto.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import br.edu.senacsp.projeto.Projeto.Aluno;
import br.edu.senacsp.projeto.repositories.AlunoRepository;

public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;


    @Bean
    public void instaciarDB(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Aluno aluno1= new Aluno("Lucas Matulis", LocalDateTime.parse("01/08/2022 08:30", formato));
    }
    
}
