package br.com.generation.interfaces;

public class TestaInterface {

	public static void main(String[] args) {
		
		//Extends ---> para herança, herdar atributos de classe;
		//Implements ---> para usar interfac;
		
		//Uma classe pode herdar de apenas uma; inplemenst pode herdar varias interfaces.
		
		//Possibilidade *Classe extends OutraClasse e implements Interface*
		
		
		//Cachorro
		Cachorro meuCachorro = new Cachorro();
		
		System.out.println();
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		//Gato
		Gato meuGato = new Gato();
		
		System.out.println();
		meuGato.somAnimal();
		meuGato.dormir();
	}
}
