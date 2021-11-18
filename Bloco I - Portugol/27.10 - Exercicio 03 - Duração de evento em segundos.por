programa //sistema leia tempo duração de um evento fábrica expressa em segundos
{
	
	funcao inicio()
	{
		inteiro tempo, horas, minutos, segundos

		escreva("Quantos segundos de duração terá o evento? ")
		leia(segundos)

		horas = (segundos / 3600) //Divisão
		minutos = ((segundos % 3600) / 60) //RestoDivisão e Divisão
		segundos = ((segundos % 3600) % 60)//RestoDivisão e Divisão


        escreva("O evento terá a duração de ", horas, " horas, ", minutos, " minutos e ", segundos, " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */