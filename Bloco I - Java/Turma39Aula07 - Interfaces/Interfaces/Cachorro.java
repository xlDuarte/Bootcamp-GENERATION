package br.com.generation.interfaces;

public class Cachorro implements Animal{
		
		@Override
		public void somAnimal() {
			System.out.println("Cachorro latindo: Au... Au... ");
		}
		
		@Override
		public void dormir() {
			System.out.println("Cachorro... dormindo... ");
	}
}
