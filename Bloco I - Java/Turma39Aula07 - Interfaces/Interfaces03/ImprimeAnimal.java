package br.com.generation.interfaces03;

public class ImprimeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
		
		t.fazerAnimalComer(new Animal());

	}

}
