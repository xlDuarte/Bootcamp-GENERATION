programa
{
	
	funcao inicio()
	{
		inteiro custo, total
        
		escreva("Qual é o custo de fabricação do veículo? ")
		leia(custo)

		// % do distribuidor 28%
		// % de impostos 45%
		total = ((custo / 100) * 28) + ((custo / 100) * 45) + custo

		escreva("O custo do veículo para o consumidor será de ", total, " reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */