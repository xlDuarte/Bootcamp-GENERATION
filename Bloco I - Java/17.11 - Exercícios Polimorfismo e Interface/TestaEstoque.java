package excollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<Estoque>();

		System.out.println("Quantos itens você quer cadastrar? ");
		int cadastro = leia.nextInt();

		for (int c = 0; c < cadastro; c++) {
			System.out.println("Digite o número do " + (c + 1) + "º produto: ");
			String item = leia.next();

			estoque.add(new Estoque(item));

		}
		for (Estoque c : estoque) {
			System.out.println(c);
		}
		estoque.remove(2);
		System.out.println("Estoque depois da saída do produto: " + estoque);

		leia.close();
	}

}
