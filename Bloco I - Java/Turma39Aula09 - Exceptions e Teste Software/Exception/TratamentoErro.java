package br.com.generation.exception;

public class TratamentoErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[4];
		System.out.println("Antes da Exception!");
		
		try {
		vetor[4] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro consertado!!!");
		}
	}

}
