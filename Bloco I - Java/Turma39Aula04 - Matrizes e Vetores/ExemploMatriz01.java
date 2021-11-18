package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 8.8;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 5.6;
		notasAlunos[1][3] = 5.8;
		
		//== Impressão da matriz ==
		for(int l = 0; l < notasAlunos.length; l++) { //vai caminhar nas linhas
			for(int c = 0; c < notasAlunos[l].length; c++) { //vai caminhas nas colunas
				System.out.print(notasAlunos[l][c] + "|");
			}
			System.out.println();
		}
	}
}
