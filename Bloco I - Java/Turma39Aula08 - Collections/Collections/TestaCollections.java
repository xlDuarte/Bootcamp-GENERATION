package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aula1 = "ABloco I - Java";
		String aula2 = "CBloco II - BackEnd - SpringBoot";
		String aula3 = "DBloco III - FrontEnd";
		String aula4 = "BBloco IV - Java Mobile";
		
		ArrayList<String> aulas = new ArrayList();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		
		//aulas.remove(1);
		//System.out.println(aulas);
		
		System.out.println();
		for(String i : aulas) {
			System.out.println("Aulas: "+ i);	
		}
		
		String primeiraAula = aulas.get(1);
		System.out.println();
		System.out.println("A primeira aula é: "+ primeiraAula);
		
		
		System.out.println();
		for(int i = 0; i <aulas.size(); i++) {
			System.out.println("Aulas "+ (i+1) +" : "+ aulas.get(i));
		}
		System.out.println(aulas.size());
		
		Collections.sort(aulas); // Coloca a lista na ordem crescente (independente do tipo)...
		
		System.out.println(aulas);
		
	}
}
