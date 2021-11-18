programa
{
	
	funcao inicio()
	{
		inteiro notas[4][4] = {{10,20,30,40}, // --> Linha [0]
						   {10,20,30,40}, // --> Linha [1]
						   {10,20,30,40}, // --> Linha [2]
						   {10,20,30,40}} // --> Linha [3]

			para(inteiro linha = 0; linha <= 3; linha++){

				para(inteiro coluna = 0; coluna <= 3; coluna++){
					escreva(notas[linha][coluna], ", ")
				}

				escreva("\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */