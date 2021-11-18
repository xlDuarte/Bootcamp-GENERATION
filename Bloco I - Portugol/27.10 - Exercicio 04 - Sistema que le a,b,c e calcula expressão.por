programa //sistema que leia três números inteiros e positivos (A, B, C) e calc expressao
{
	
	inclua biblioteca Matematica --> mat
    
	funcao inicio()
	{
	real ab, r, bc, s, d
	real numA, numB, numC

	escreva("Digite o valor do número A: ")
	leia(numA)

	escreva("Digite o valor do número B: ")
	leia(numB)

	escreva("Digite o valor do número C: ")
	leia(numC)
	
	ab = (numA + numB)
	r = mat.potencia(ab, 2.0)
	
	bc = (numB + numC)
	s = mat.potencia(bc, 2.0)
	
	d = ((r + s) / 2)

	escreva("\nO resultado da expressão D = R+S/2 resulta em = ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */