package br.com.generation.classes;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		//Instanciando(criando) o objeto de Aluno
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Rodrigo - Morango";
		aluno2.idade = 20;
		aluno2.curso = "Bloco II - Javara Misturado";
		
		aluno1.nome  = "Gabriel - Chocolate";
		aluno1.idade = 27;
		aluno1.curso = "Bloco I - Java Puro";
		
		System.out.println();
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		
		System.out.println();
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		leia.close();
	}
}
