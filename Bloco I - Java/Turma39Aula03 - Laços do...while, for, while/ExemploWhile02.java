package br.generation.lacowhile;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//La�o de repeti��o --> Enquanto
		
		int contador = 10;
		
		while(contador >= 0 ) {
			System.out.println("Repeti��o: nr. " + contador);
			contador--;
			Thread.sleep(500);
		}
	}

}
