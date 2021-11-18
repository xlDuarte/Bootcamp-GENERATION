package br.com.generation.sobrecarga.encapsulamento;

import java.util.Scanner;

public class TestaVe�culo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a fabricante do ve�culo: ");
		String marca = leia.next();
		
		Ve�culo vc = new Ve�culo();
		
		vc.setMarca(marca);	//Alterando o atributo marca atrav�s do m�todo setMarca
		
		System.out.println("A fabricante do ve�culo �: " + vc.getMarca()); //" --> Recuperando os dados do atributo marca atrav�s do m�todo getMarca
		
		leia.close();
	}
}
