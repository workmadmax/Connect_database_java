package module;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Amigos implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer	id;
    private String	nome;
    private Integer	idade;
    private String	apelido;

	
    public Amigos() {
		super();
	}
	public Amigos(Integer id, String nome, Integer idade, String apelido) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.apelido = apelido;
	}
	// gerear os getter and setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@Override
	public String toString() {
		return ("Amigos [id=" + id + ", nome=" + nome + ", idade=" + idade + ", apelido=" + apelido + "]");
	}
}

