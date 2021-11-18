programa //Construindo um Programa que tem como dados de entrada pontos (P1 e P2)
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		real x1, x2, y1, y2, p1, p2, d

		escreva("Digite o valor de X do primeiro ponto: ")
		leia(x1)

		escreva("Digite o valor de Y do primeiro ponto: ")
		leia(y1)

		escreva("Digite o valor de X do segundo ponto: ")
		leia(x2)

		escreva("Digite o valor de Y do segundo ponto: ")
		leia(y2)

		p1 = mat.potencia((x2-x1), 2.0)
		p2 = mat.potencia((y2-y1), 2.0)
		d = mat.raiz(p1 + p2, 2.0)

		escreva("A distância entre os dois pontos é de: " , d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */