programa
{
	// 6)Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	// Infantil A = 5 a 7 anos, Infantil B = 8 a 11 anos, Juvenil A = 12 a 13 anos, Juvenil B = 14 a 17 anos, Adultos = Maiores de 18 anos

	funcao inicio()
	{
		//Inserir as variáveis
		inteiro idadenadador
		
		escreva("Olá nadador. Digite sua idade: ")
		leia(idadenadador)


		se(idadenadador < 5){
			escreva("O nadador está abaixo da idade necessária." )
		}
		senao se(idadenadador >= 5 e idadenadador <= 7){
			escreva("\n" + "O nadador está classificado na categoria: Infantil A. " )
		}
		senao se(idadenadador >= 8 e idadenadador <= 11){
			escreva("\n" + "O nadador está classificado na categoria: Infantil B. " )
		}
		senao se(idadenadador >= 12 e idadenadador <= 13){
			escreva("\n" + "O nadador está classificado na categoria: Juvenil A. " )
		}
		senao se(idadenadador >= 14 e idadenadador <= 17){
			escreva("\n" + "O nadador está classificado na categoria: Juvenil B. " )
		}
		senao se(idadenadador >= 18){
			escreva("\n" + "O nadador está classificado na categoria: Adultos. " )
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */