programa
{
	//7. Escreva um algoritmo que leia os coeficientes a,b,c,d,e,f
	// e também calcule e mostre os valores de x e y:
	funcao inicio()
	{
		//Coeficientes
		real a, b, c, d, E, f, x, y

		escreva("\nO valor de A é: ")
		leia(a)

		escreva("Digite o valor de B: ")
		leia(b)

		escreva("Digite o valor de C: ")
		leia(c)

		escreva("Digite o valor de D: ")
		leia(d)

		escreva("Digite o valor de E: ")
		leia(E)

		escreva("Digite o valor de F: ")
		leia(f)

		x = ((c*E) - (b*f)) / ((a*E) - (b*d))
		y = ((a*f) * (c*d)) / ((a*E) - (b*d))

		escreva("\nO valor de X é: " + x + " e o valor de Y é: " + y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */