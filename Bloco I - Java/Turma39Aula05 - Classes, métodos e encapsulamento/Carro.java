package br.com.generation.classes.carro;

public class Carro {
	
	//Atributos
	String nome; String marca;
	int ano; int velocidade = 0;
	
	//M�todos
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
}
