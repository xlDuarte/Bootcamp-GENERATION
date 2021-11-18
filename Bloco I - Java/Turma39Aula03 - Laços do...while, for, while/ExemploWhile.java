package br.generation.lacowhile;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Laço de repetição --> Enquanto
	
		int contador = 0;
		
		while(contador <= 10 ) {
			System.out.println("Repetição: nr. " + contador);
			contador++;
			Thread.sleep(500);
		}
	}
}
