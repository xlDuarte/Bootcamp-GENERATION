package br.com.generation.sobrecarga.encapsulamento;

import java.util.Scanner;

public class TestaVeículo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a fabricante do veículo: ");
		String marca = leia.next();
		
		Veículo vc = new Veículo();
		
		vc.setMarca(marca);	//Alterando o atributo marca através do método setMarca
		
		System.out.println("A fabricante do veículo é: " + vc.getMarca()); //" --> Recuperando os dados do atributo marca através do método getMarca
		
		leia.close();
	}
}
