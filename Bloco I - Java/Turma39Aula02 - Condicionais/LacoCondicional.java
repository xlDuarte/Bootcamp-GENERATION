package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		media  = (nota1 + nota2) / 2;
				
				if(media >= 6.0) {
					System.out.println("\n" + "Aprovado" + "\n" + "Média" + media);
				}
				else if(media >= 3.0 && media < 6.0) {
					System.out.println("\n" + "Recuperação" + "\n" + "Média" + media);
				}
				else {
					System.out.println("\n" + "Reprovado" + "\n" + "Média" + media);
				}
		
		leia.close();
	}

}
