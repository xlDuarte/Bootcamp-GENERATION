package programaçãosequencial;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7. Escreva um algoritmo que leia os coeficientes a,b,c,d,e,f
		// e também calcule e mostre os valores de x e y:
		
		Scanner leia = new Scanner(System.in);
		
		int custo, total;
        
		System.out.println("Qual é o custo de fabricação do veículo? ");
		custo = leia.nextInt();

		// % do distribuidor 28%
		// % de impostos 45%
		total = ((custo / 100) * 28) + ((custo / 100) * 45) + custo;

		System.out.println("O custo do veículo para o consumidor será de " + total + " reais.");
		
		leia.close();
	}

}
