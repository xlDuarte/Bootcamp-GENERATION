package programa��osequencial;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7. Escreva um algoritmo que leia os coeficientes a,b,c,d,e,f
		// e tamb�m calcule e mostre os valores de x e y:
		
		Scanner leia = new Scanner(System.in);
		
		int custo, total;
        
		System.out.println("Qual � o custo de fabrica��o do ve�culo? ");
		custo = leia.nextInt();

		// % do distribuidor 28%
		// % de impostos 45%
		total = ((custo / 100) * 28) + ((custo / 100) * 45) + custo;

		System.out.println("O custo do ve�culo para o consumidor ser� de " + total + " reais.");
		
		leia.close();
	}

}
