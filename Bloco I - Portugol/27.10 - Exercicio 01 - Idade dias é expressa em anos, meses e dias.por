programa
{
	
	funcao inicio()
	{
		inteiro idade, anos, meses, dias

		escreva("Quantos dias de idade você tem? ")
		leia(dias)

		anos = (dias / 365) //Divisão
		meses = ((dias % 365) / 30) //RestoDivisao e Divisao
		dias = ((dias % 365) % 30) //Divisão
								
		escreva("Voçê tem " + anos + " anos, " + meses + " meses, " + dias + " e dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */