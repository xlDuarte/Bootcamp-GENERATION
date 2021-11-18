package br.com.generation.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		System.out.println("Quantos alunos você quer inserir: ");
		int numeroAlunos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite o nome do Aluno: ");
			String nome = sc.next();
			sc.nextLine();
			
			System.out.println("Digite a idade do Aluno: ");
			int idade = sc.nextInt();
			
			alunos.add(new Aluno(nome, idade));
		}
		for(Aluno al : alunos) {
			System.out.println(al);
		}
	}
}
