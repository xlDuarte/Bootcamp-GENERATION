package br.generation.lacodowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Laço de Repetição ---> faça ---> enquanto ---> do - while (LOOP ENQUANTO FALSO)
		
		int i = 0;
		
		do {
			System.out.println( i );
			i++;
			Thread.sleep(500);
		}
		while(i <= 10);
	}
}
