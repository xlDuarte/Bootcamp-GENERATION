package br.com.generation.herança;

public class TestaTodoMundo {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		Professor prof2 = new Professor();
		
		prof1.setNome("Jeff");
		prof1.setIdade(23);
		prof1.setEndereco("Rua: Henrique Mendes, n. 582.");
		prof1.setDisciplina("Geografia");
		prof1.setSalario(1000.00);
		
		System.out.println();
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());
		System.out.println();
		
		prof2.setNome("Gabriel");
		prof2.setIdade(55);
		prof2.setEndereco("Rua: Dos empresários, n. 582.");
		prof2.setDisciplina("Geografia");
		prof2.setSalario(5000.00);
		
		System.out.println(prof2.getNome());
		System.out.println(prof2.getIdade());
		System.out.println(prof2.getEndereco());
		System.out.println(prof2.getDisciplina());
		System.out.println(prof2.getSalario());
		
	}

}
