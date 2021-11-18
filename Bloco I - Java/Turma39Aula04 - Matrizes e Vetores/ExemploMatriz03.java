package br.com.generation.matriz;

import java.util.Scanner;

public class ExemploMatriz03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("=== Notas do Aluno ===");
		
		//Adicionando valores na matriz
		for(int l = 0; l < notasAlunos.length; l++) 
		{
			for(int c = 0; c < notasAlunos[l].length; c++) 
			{
				System.out.printf("\n" + "Digite as notas...%d|%d: ", l,c);
				notasAlunos[l][c] = leia.nextDouble();
			}
			System.out.println();
		}
		//Imprimindo valores da Matriz
		for(int l = 0; l < notasAlunos.length; l++) 
		{
			for(int c = 0; c < notasAlunos[l].length; c++) 
			{
				System.out.print(notasAlunos[l][c] + "|");
			}
			System.out.println();
		}
		leia.close();
	}
}
