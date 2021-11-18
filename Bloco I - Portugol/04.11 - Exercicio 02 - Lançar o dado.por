programa
{
	// 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	// A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	
	funcao inicio()
	{
		real results[10]
		real soma = 0.0, cont = 0.0, maior = 0.0, media = 0.0

		escreva ("--------------------------------\n")
		escreva ("       LANÇAMENTO DE DADOS      \n")
		escreva ("--------------------------------\n")

		para(inteiro lado = 0; lado < 10; lado++){
			escreva("O " + (lado + 1) + "º resultado: ")
			leia(results[lado])

			soma = (soma + results[lado])

			se(maior < results[lado]){
				maior = results[lado]
			}

			se(results[lado] > maior){
				cont++
			}
		}
		
		media = soma / 10
		
		escreva("\n" + "O maior número lançado foi o: " + maior)
		escreva("\n" + "O número acima apareceu " + cont++ + " vezes.")
		escreva("\n" + "A média aritmética dos resultados dos lançamentos foi: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 768; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */