programa
{
	
	funcao inicio()
	{
		inteiro mediafinal
		inteiro notaA, notaB, notaC
		inteiro notaAtot, notaBtot, notaCtot

		escreva("Digite a primeira nota: ")
		leia(notaA)

		escreva("Digite a segunda nota: ")
		leia(notaB)

		escreva("Digite a terceira nota: ")
		leia(notaC)

		notaAtot = (notaA * 2) //Média ponderada
		notaBtot = (notaB * 3) //Média ponderada
		notaCtot = (notaC * 5) //Média ponderada

		mediafinal = (notaAtot + notaBtot + notaCtot) / 10

		escreva("\nA média final do aluno é ", mediafinal, ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */