package br.generation.vetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		int i = 0;
		
		for(i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "� nota do Aluno: ");
			notas[i] = leia.nextDouble();
			soma = soma + notas[i];
			media = soma / notas.length; //Poderia ser o 4 tamb�m, que � a quantia de notas que est� no New Double [4].
			
		}	
		System.out.println("A soma dos valores �: " + soma + "\n");
		System.out.println("A m�dia das notas �: " + media);
		leia.close();
	}
}
