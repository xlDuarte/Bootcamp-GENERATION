package br.com.generation.interfaces;

public class Gato implements Animal{
	
	@Override
	public void somAnimal() {
		System.out.println("Gato miando: Miau... Miau... ");
	}
	
	@Override
	public void dormir() {
		System.out.println("Gato... dormindo... ");
		
	}
}
