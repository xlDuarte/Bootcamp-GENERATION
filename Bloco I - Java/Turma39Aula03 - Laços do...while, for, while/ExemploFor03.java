package br.com.generation.lacofor;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int sobe = 0, desce = 10;
		
		for(; sobe <= 10 && desce >= 0;) {
			
			System.out.println(sobe + " | " + desce);
			
			sobe++;
			desce--;
			Thread.sleep(500);
		}
	}
}
