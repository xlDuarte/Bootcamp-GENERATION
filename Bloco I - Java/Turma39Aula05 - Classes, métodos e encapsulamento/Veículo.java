package br.com.generation.sobrecarga.encapsulamento;

public class Veículo {
	
	//Atributos PRIVADOS
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	
	//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
}
