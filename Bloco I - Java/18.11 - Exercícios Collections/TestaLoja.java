package exerciciocollection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLoja {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int products;
		
		System.out.println("Qual o tamanho do estoque? ");
		products = scan.nextInt();
		
		ArrayList<LojaCollection> lojaFeira = new ArrayList();
		
		for(int i = 0; i < products ; i++) {
			String mirtilo,pera,melancia,abacaxi;
			
			System.out.println("Qual tipo de Mirtilo temos em estoque? ");
			mirtilo =scan.next();
			
			System.out.println("Qual tipo de Pera temos em estoque? ");
			pera =scan.next();
			
			System.out.println("Qual tipo de Melancia temos em estoque? ");
			melancia =scan.next();
			
			System.out.println("Qual tipo de Abacaxi temos em estoque? ");
			abacaxi =scan.next();
			
			lojaFeira.add(new LojaCollection(products, "4", mirtilo, pera, melancia, abacaxi));
			
		}
		for(LojaCollection al : lojaFeira) {
			System.out.println(al);
		} 
	}
}