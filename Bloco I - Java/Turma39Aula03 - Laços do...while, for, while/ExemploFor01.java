package br.com.generation.lacofor;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Repetindo a variavel i: " + i );
			Thread.sleep(500);
		}
	}
}
