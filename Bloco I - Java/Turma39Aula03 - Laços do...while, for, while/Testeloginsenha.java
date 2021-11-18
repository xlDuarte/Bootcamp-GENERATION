package br.generation.lacodowhile;

import java.util.Scanner;

public class Testeloginsenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Laço de Repetição ---> faça ---> enquanto ---> do - while (LOOP ENQUANTO FALSO)
		Scanner leia = new Scanner(System.in);
		
		System.out.println("SISTEMA DE LOGIN: ");
		System.out.println("================= ");
		
		String login = leia.next();
		int senha;
		
		do {
			System.out.println("Digite seu login: ");
			login = leia.next();

			System.out.println("Digite sua senha: ");
			senha = leia.nextInt();
		}
		while(login != "jeff" && senha != 123);
			System.out.println("\n" + "Entrando no sistema...");
	}
}
