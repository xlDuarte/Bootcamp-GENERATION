package br.com.generation.interfaces02;

public class TestaCarro {

	public static void main(String[] args) {

		//Extends ---> para heran�a, herdar atributos de classe;
		//Implements ---> para usar interface;
		
		//Uma classe pode herdar de apenas uma; inplemenst pode herdar varias interfaces.
		
		//Possibilidade *Classe extends OutraClasse e implements Interface*
		
		//Interface � mesmo m�todo, mas no corpo do m�todo muda alguma coisa
		//Se eles v�o se repetir em todas as classes, � melhor colocar numa interface.
		
		//Interface obriga o m�todo utilizado

		
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
		//f.nacionalidade = "It�lia";
		
		//Fusca d = new Fusca();
		//d.nacionalidade = "Alemanha";
		
		
	}
}
