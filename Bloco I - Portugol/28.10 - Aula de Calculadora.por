programa
{
	
	funcao inicio()
	{
		//Declaração de variavel
		real numero1, numero2, resultado = 0
		caracter operacao

		escreva("Digite o primeiro número: ")
		leia(numero1)

		escreva("Digite a operação desejada: ")
		leia(operacao)

		escreva("Digite o segundo número: ")
		leia(numero2)


		//Condicionais
		se(operacao == '+')
		{
			resultado = numero1 + numero2
			escreva("Resultado: ", resultado)
		}
		senao se(operacao == '-')
		{
			resultado = numero1 - numero2
			escreva("Resultado: ", resultado)
		}
		senao se(operacao == '*')
		{
			resultado = numero1 * numero2
			escreva("Resultado: ", resultado)
		}
		senao se(operacao == '/')
		{
			resultado = numero1 / numero2
			escreva("Resultado: ", resultado)
		}
		senao{
			escreva("Operação Inválida!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */