package exercicioclassesobjetos4;

import java.util.Scanner;

public class Funcion�rio {
	
	//4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
	//em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	
	Scanner logar = new Scanner(System.in);
	
	//Atributos PRIVADOS
	private String nome, cargo;
	private int numregistro, entradasist;
		
		//Getter e Setter - Acessar os dados privados (bot�o direito -> source -> generate setters e getters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public int getNumRegistro() {
			return numregistro;
		}
		public void setNumRegistro(int numregistro) {
			this.numregistro = numregistro;
		}
		public int getEntradasist() {
			return entradasist;
		}
		public void setEntradasist(int entradasist) {
			this.entradasist = entradasist;
		}
		void Conexao() {
			System.out.println("Deseja entrar no sistema da empresa? " +  "\n" +  "|1| - Sim " +  "\n" + "|0| - N�o");
			entradasist = logar.nextInt();
		
		if(entradasist == 1) {
			System.out.println("Entrando no sistema da empresa...");
		}
		else {
			System.out.println("Encerrando.");
		}
		logar.close();
	}
}
