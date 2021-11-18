package exercicioclassesobjetos1;

import java.util.Scanner;

public class TestaCliente01 {
	
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite apenas seu primeiro nome: ");
		String nome = leia.next();
		System.out.println("Digite seu sexo: | Masculino | Feminino | Não Binário |: ");
		String sexo = leia.next();
		System.out.println("Digite seu estado civil: | Solteiro(a) | Casado(a) | Viúvo(a) |: ");
		String estadocivil = leia.next();
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		System.out.println("Digite quantos filhos você tem: ");
		int filhos = leia.nextInt();
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome(nome); //Alterando o atributo através do método setMarca
		cliente1.setSexo(sexo);
		cliente1.setEstadocivil(estadocivil);
		cliente1.setIdade(idade);
		cliente1.setFilhos(filhos);
		
		System.out.print("\n");
		System.out.println("O cliente: " + cliente1.getNome()); //" --> Recuperando os dados do atributo através do método getMarca
		System.out.println("É do sexo: " + cliente1.getSexo());
		System.out.println("Seu estado civil é: " + cliente1.getEstadocivil());
		System.out.println("Tem a idade de: " + cliente1.getIdade() + " anos. ");
		System.out.println("Tem: " + cliente1.getFilhos() + " filhos. ");
		leia.close();
	}
}
