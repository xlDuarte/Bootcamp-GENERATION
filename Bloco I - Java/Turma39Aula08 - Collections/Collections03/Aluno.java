package br.com.generation.collections03;

public class Aluno {
	
	private String nome;
	private int idade;
	
	
	//Construtor
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getter and setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//toString Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}
}
