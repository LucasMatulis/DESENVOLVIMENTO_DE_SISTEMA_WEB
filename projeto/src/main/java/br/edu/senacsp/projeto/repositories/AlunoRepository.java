package br.edu.senacsp.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senacsp.projeto.Projeto.Aluno;


    @Repository
    public interface AlunoRepository extends JpaRepository<Aluno,Integer>{

        
    }

    

