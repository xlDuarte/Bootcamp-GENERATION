programa
{
	
	funcao inicio()
	{
		//Inserir as variaveis
		inteiro num

		escreva("Par ou Ímpar: ")
		leia(num)

		se(num % 2 == 0){
			escreva("O número informado " + num + " é par." )
		}
		senao{
			escreva("O número informado " + num + " é ímpar." )
		}
		se(num >= 0){
			escreva("\n" + "O número é positivo." )
		}
		senao{
			escreva("\n" + "O número é negativo." )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */