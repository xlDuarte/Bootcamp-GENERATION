programa
{
	
	funcao inicio()
	{
		//laço de Repetição ---> Para - For
		inteiro num, cont, maior = 0

		para(cont = 1; cont <= 5; cont = cont + 1){

			escreva("\n" + "Digite um número: ")
			leia(num)

			se(num > maior){
				maior = num
			}
			escreva("O maior dos números lidos = ", maior)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */