package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, soma;

		System.out.println("Escreva o valor de a: ");
		a = leia.nextInt();

		System.out.println("Escreva o valor de b: ");
		b = leia.nextInt();

		soma = a + b;

		System.out.println("A soma de a com b é: " + soma);

		leia.close();
	}

}
