programa
{
	
	funcao inicio()
	{
		inteiro idade, anos, meses, dias

		escreva("Quantos anos você tem? ")
		leia(anos)

		escreva(anos, " e quantos meses ? ")
		leia(meses)

		escreva("Há quantos dias você completou ", anos, " anos e ", meses, " meses? ")
		leia(dias)

		idade = (365*anos) + (30*meses) + dias

		escreva("Você nasceu há ", idade, "dias.")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */