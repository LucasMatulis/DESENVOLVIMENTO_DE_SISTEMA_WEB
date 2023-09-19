package classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
	
	private String nome;
    private String ra;
    private String cep;
    private String numero;
    private String complemento;
    private double notaAdo1;
    private double notaPI;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
