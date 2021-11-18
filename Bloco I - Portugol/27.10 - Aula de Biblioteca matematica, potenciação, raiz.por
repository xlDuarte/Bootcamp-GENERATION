programa
{
	//Utilizando Biblioteca

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

	// São as Declarações de variáveis	
	real a, b, potencia, raiz

	escreva("Entre com o valor de A: ")
	leia(a)

	escreva("Entre com o valor de B: ")
	leia(b)

	//Cálculo de potenciação
	potencia = mat.potencia((a+b), 2.0)
	
	//Cálculo de raiz
	raiz = mat.raiz((a+b), 3.0)
	
	escreva("\nPotencia: " + potencia) // \n Quebra para linha de baixo
	escreva("\nRaiz: " + raiz) 	// \n Quebra para linha de baixo
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */