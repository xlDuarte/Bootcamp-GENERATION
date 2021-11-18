programa 
{
	/*Programa: Operadores Aritméticos
	*Autor: Gabriel
	*Data: 27/10/2021
	 */
	funcao inicio() 
	{
		
	// + Soma
	// - Subtração
	// * Multiplicação
	// / Divisão
	// % Resto da divisão

	inteiro numero1, numero2, soma, subtracao, multiplicacao, divisao, restodivisao // São as Declarações de variáveis	

	escreva(" Digite o primeiro número: ")
	leia(numero1)

	escreva(" Digite o segundo número: ")
	leia(numero2)

	soma = numero1 + numero2
	subtracao = numero1 - numero2
	multiplicacao = numero1 * numero2
	divisao = numero1 / numero2
	restodivisao = numero1 % numero2

	// \n Quebra para linha de baixo
	
	escreva("Soma: " + soma)
	escreva("\nSubtração: " + subtracao)
	escreva("\nMultiplicação: " + multiplicacao)
	escreva("\nDivisão: " + divisao)
	escreva("\nResto da Divisão: " + restodivisao) 

	meio()
	fim()
	}

	funcao meio(){

		escreva("\nEsta é a função do meio!")
	}

	funcao fim(){
		escreva("\nEsta é a função fim!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */