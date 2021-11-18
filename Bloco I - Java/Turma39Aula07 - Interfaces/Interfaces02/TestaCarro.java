package br.com.generation.interfaces02;

public class TestaCarro {

	public static void main(String[] args) {

		//Extends ---> para herança, herdar atributos de classe;
		//Implements ---> para usar interface;
		
		//Uma classe pode herdar de apenas uma; inplemenst pode herdar varias interfaces.
		
		//Possibilidade *Classe extends OutraClasse e implements Interface*
		
		//Interface é mesmo método, mas no corpo do método muda alguma coisa
		//Se eles vão se repetir em todas as classes, é melhor colocar numa interface.
		
		//Interface obriga o método utilizado

		
		Carro c = new Ferrari();
		c.acelerar();
		System.out.println("      ___________");
		System.out.println("  ___|__|   |__| |___");
		System.out.println("<|___|____-___-__|__|");
		System.out.println("    O            O   ");
		System.out.println();
		
		c = new Fusca();
		c.acelerar();
		System.out.println("        |__________|");
		System.out.println("________|_|   |_|  |");
		System.out.println("|__________________|");
		System.out.println("   O            O   ");
		
		//Ferrari f = new Ferrari();
		//f.nacionalidade = "Itália";
		
		//Fusca d = new Fusca();
		//d.nacionalidade = "Alemanha";
		
		
	}
}
