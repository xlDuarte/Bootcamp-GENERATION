package br.generation.lacowhile;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero = -1;
				
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero == 0) {
				System.out.println("Final da contagem... ");
			}
		}
		leia.close();
	}
}
