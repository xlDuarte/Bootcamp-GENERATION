package exerc�ciospolimorfismo01e02;

//1-	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
//utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal:

//2-	Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior
//e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do tipo de animal. Exerc�cios Collections.

public class Teste {
	
	public static void main(String[] args) {
		
		//Cachorro
		Cachorro ch = new Cachorro();
		
		ch.setNome("O nome do cachorro �: Otto.");
		ch.setIdade(5);
		ch.setEmitirsom("Au Au");
		ch.setMovimentacao("Correr.");
		
		System.out.println("Nome:  "+ch.getNome());
		System.out.println("Idade: "+ch.getIdade());
		System.out.println("Som:   "+ch.getEmitirsom());
		System.out.println("Movimentos:  "+ch.getMovimentacao());
		System.out.println();
		
		//Cavalo
		Cavalo cv = new Cavalo();
		
		cv.setNome("O nome do cavalo �: Arceus.");
		cv.setIdade(11);
		cv.setEmitirsom("iiirrrr�, rilinchin");
		cv.setMovimentacao("Correr.");
		
		System.out.println("Nome:  "+cv.getNome());
		System.out.println("Idade: "+cv.getIdade());
		System.out.println("Som:   "+cv.getEmitirsom());
		System.out.println("Movimentos:  "+cv.getMovimentacao());
		System.out.println();
		
		//Pregui�a
		Pregui�a pc = new Pregui�a();
		
		pc.setNome("O nome da pregui�a �: Lento.");
		pc.setIdade(17);
		pc.setEmitirsom("...");
		pc.setMovimentacao("Subir em arvores.");
		
		System.out.println("Nome:  "+pc.getNome());
		System.out.println("Idade: "+pc.getIdade());
		System.out.println("Som:   "+pc.getEmitirsom());
		System.out.println("Movimentos:  "+pc.getMovimentacao());
		
	}

}
