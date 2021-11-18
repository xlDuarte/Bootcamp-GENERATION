package excollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<Estoque>();

		System.out.println("Quantos itens voc� quer cadastrar? ");
		int cadastro = leia.nextInt();

		for (int c = 0; c < cadastro; c++) {
			System.out.println("Digite o n�mero do " + (c + 1) + "� produto: ");
			String item = leia.next();

			estoque.add(new Estoque(item));

		}
		for (Estoque c : estoque) {
			System.out.println(c);
		}
		estoque.remove(2);
		System.out.println("Estoque depois da sa�da do produto: " + estoque);

		leia.close();
	}

}
