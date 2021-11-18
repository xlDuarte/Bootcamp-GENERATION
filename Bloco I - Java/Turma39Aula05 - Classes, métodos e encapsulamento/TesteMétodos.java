package br.com.generation.metodos;

import java.util.Scanner;

public class TesteMétodos {
	
	public static int num1, num2, outrasoma; //Variáveis globais (atua em todos os métodos) //Colocadas antes do Main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		metodo7();
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(num1, num2); // --> Multiplicação
		metodo8(num1, num2); // --> Divisão
		System.out.println("Método 6 sendo chamado da classe Externa: " + MétodoFora.metodo6(num1, num2));
	}
	public static void metodo1() {
		System.out.println("Olá, eu sou o método 1...");
	}
	public static void metodo2() {
		double soma, numero1 = 200.0, numero2 = 100.0;
		soma = numero1 + numero2;
		System.out.println("A soma do método 2: " + soma);
	}
	public static void metodo3() {
		outrasoma = num1 + num2;
		System.out.println("A soma do método 3: " + outrasoma);
	}
	public static void metodo4() {
		System.out.println("A soma do método 3, também chamada pelo método 4: " + outrasoma);
	}
	public static void metodo5(int n1, int n2) {
		int multiplicacao = n1 * n2;
		System.out.println("Multiplicação no método 5: " + multiplicacao);
	}
	public static void metodo7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número 1: ");
		num1 = scan.nextInt();
		System.out.println("Entre com o número 2: ");
		num2 = scan.nextInt();
		scan.close();
	}
	public static void metodo8(int n1, int n2) {
		int divisao = n1 / n2;
		System.out.println("Divisão no método 8: " + divisao);
	}
}