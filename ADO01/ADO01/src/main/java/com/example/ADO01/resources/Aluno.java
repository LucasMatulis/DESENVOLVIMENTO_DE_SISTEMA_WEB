package com.example.ADO01.resources;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name="Alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column (name="Nome")
	private String nome;
	
    @Column (name="RA")
    private String ra;
    
    @Column (name="CEP")
    private String cep;
    
    @Column (name="Numero")
    private String numero;
    
    @Column (name="Complemento")
    private String complemento;
    
    @Column (name="NotaAdo1")
    private double notaAdo1;
    
    @Column (name="NotaPI")
    private double notaPI;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public double getNotaAdo1() {
		return notaAdo1;
	}
	public void setNotaAdo1(double notaAdo1) {
		this.notaAdo1 = notaAdo1;
	}
	public double getNotaPI() {
		return notaPI;
	}
	public void setNotaPI(double notaPI) {
		this.notaPI = notaPI;
	}
}