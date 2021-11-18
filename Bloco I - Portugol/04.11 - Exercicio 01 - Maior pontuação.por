programa
{
	// 1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	// Encontre após a maior pontuação e a apresente.
	
	funcao inicio()
	{
		real leiturapont[5], maior = 0.0
		
		para(inteiro i = 0; i < 5; i++){
			escreva("Insira as pontuações: ")
			leia(leiturapont[i])
			
			se(maior < leiturapont[i]){
				maior = leiturapont[i]
			}
		}

		escreva("\n" + "A maior pontuação dentre as atividades é: " + maior + "!" + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {leiturapont, 8, 7, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */