package br.com.generation.teste.software;

import java.util.Scanner;

public class TesteUnitario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com dois numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		int resultado = calc.soma(num1, num2);
		
		if(resultado == resultadoEsperado) {
			System.out.println("Resultado esperado = Teste Ok!");
		}
		else {
			System.out.println();
		}

	}

}
