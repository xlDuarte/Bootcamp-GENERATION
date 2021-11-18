package exercicioclassesobjetos7;

import java.util.Scanner;

public class Paciente {
	
	//7) Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe,
	//em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	
	Scanner leia = new Scanner(System.in);
	
	//Atributos PRIVADOS
	private String nome, genero;
	private int idade;
	
	//Getter e Setter - Acessar os dados privados (bot�o direito -> source -> generate setters e getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	int marcar, consultar, receitar;
	
	void FazerCadastro() {
		System.out.println("Cadastrar/Agendar/Prescrever?" +  "\n" +  "|1| - Sim " +  "\n" + "|0| - N�o");
		marcar = leia.nextInt();
		
		if(marcar == 1 || consultar == 2 || receitar == 4) {
			System.out.println("Realizado!");
		}
		else {
			System.out.println("N�o realizado!");
		}
	}
}

