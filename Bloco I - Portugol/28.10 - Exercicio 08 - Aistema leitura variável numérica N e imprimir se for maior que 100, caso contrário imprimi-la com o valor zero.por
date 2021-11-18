programa
{
	//8)	Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
	funcao inicio()
	{
		//Inserir as variaveis
		inteiro num

		escreva("Digite um número: ")
		leia(num)

		se(num >= 100){
			escreva("Valor: " + num)
			escreva("\n" + "O número inserido é maior que 100!" )
		}
		senao{
			escreva("Valor: 0 ")
			escreva("\n" + "Infelizmente o número inserido é menor que 100!" )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */