package br.com.generation.classes.carro;

import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		//Instanciando(criando) o objeto
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.nome  = "Fusca";
		c1.marca = "Volks";
		c1.ano   = 1980;
		//c1.velocidade = 0;
		
		c2.nome  = "Fusion";
		c2.marca = "Ford";
		c2.ano   = 2017;
		//c2.velocidade = 0;
		
		System.out.println("Modelo do carro: " + c1.nome + 
				"               " + "Modelo do carro: " + c2.nome);
		System.out.println("Marca do carro: " + c1.marca  + 
				"                " + "Marca do carro: " + c2.marca);
		System.out.println("Ano do carro: " + c1.ano  + 
				"                   " + "Ano do carro: " + c2.ano);
		System.out.println("Velocidade atual: " + c1.velocidade + 
				"                  " + "Velocidade atual: " + c2.velocidade); //Impressão velocidade antes de acelerar
		
		c1.acelerar(80);
		System.out.println("Velocidade após acelerar: " + c2.velocidade + 
				"          " + "Velocidade após acelerar " + c2.velocidade); //Impressão velocidade depois de acelerar
		
		c1.freiar(30);
		System.out.println("Velocidade após freiar: " + c2.velocidade + 
				"            " + "Velocidade após freiar: " + c2.velocidade); //Impressão velocidade depois de freiar
		leia.close();
	}
}
