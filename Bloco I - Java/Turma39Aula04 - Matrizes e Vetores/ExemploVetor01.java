package br.generation.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//array ---> arranjo (espaço para organizar as coisas)
		
		int[] arrayVetor = new int [10]; //[0]...[9]
		
		arrayVetor[5] = 500;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + " | " + arrayVetor[i]);
			Thread.sleep(500);
		}
	}
}
