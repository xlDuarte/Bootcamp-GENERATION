programa
{
	
// 2) Desenvolver um sistema que efetue a soma de todos os números ímpares.
	//que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	funcao inicio()
	{
		inteiro cont, result =0

		para(cont = 1; cont <= 500; cont++){

			se(cont % 3 == 0 e cont % 2 == 1)
			result = result + cont
			escreva("\n" + "O total das somas do valores ímpares que são múltiplos de 3 é: " + result)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */