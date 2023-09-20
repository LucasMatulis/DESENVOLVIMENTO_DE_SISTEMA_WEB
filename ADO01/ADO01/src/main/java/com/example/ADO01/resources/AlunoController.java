package com.example.ADO01.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // Endpoint para criar um novo aluno
    @PostMapping("")
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Endpoint para buscar todos os alunos
    @GetMapping("")
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    // Endpoint para buscar um aluno por ID
    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    // Endpoint para atualizar um aluno por ID
    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        aluno.setId(id); // Certifique-se de que o ID do aluno seja definido corretamente
        return alunoRepository.save(aluno);
    }

    // Endpoint para excluir um aluno por ID
    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}
