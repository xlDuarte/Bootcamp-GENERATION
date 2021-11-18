package br.generation.vetor;

public class ExemploVetor03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		double[] graus = new double[10];
		
		graus[0] = 25.5;
		graus[1] = 26.8;
		graus[2] = 40.0;
		graus[3] = 32.3;
		graus[4] = 18.7;
		
		System.out.println("Dia 1º de dezembro: " + graus[0]);
		System.out.println("O tamanho do array: " + graus.length);
		Thread.sleep(500);
		
		for(int i = 0; i < graus.length; i++) {
			System.out.println((i+1) + "º dia: " + graus[i]);
		}
	}
}
