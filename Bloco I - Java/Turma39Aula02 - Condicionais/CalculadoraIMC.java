package br.com.generation.condicional;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double imc; //Indice de massa corporal
		double pesokg = 0.0;
		double alturametros = 0.0;
		
		System.out.println("Digite o peso atual: ");
		pesokg = leia.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		alturametros = leia.nextDouble();
		
		imc = pesokg / (alturametros * alturametros);
		
		System.out.println("\n" + "Valores do IMC: ");
		
		System.out.println("Abaixo do Peso: Menor que 18,5. ");
		System.out.println("Normal: Entre 18,5 e 24,9. ");
		System.out.println("Sobrepeso: Entre 25,0 e 29,9. ");
		System.out.println("Obeso: Acima de 30. ");
		System.out.println("\n" + "Seu IMC é: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso! Favor comer bastante! ");
		}
		if(imc > 18.5 && imc < 24.9) {
			System.out.println("Você está com peso normal! Continue assim... ");
		}
		if(imc > 25.0 && imc < 29.9) {
			System.out.println("Você está com sobrepeso! "
					+ "Favor entrar na academia e comer coisas saudáveis. ");
		}
		if(imc > 30.0) {
			System.out.println("Você está obeso! "
					+ "Favor buscar recomendações médicas!");
		}		
		leia.close();
	}

}
