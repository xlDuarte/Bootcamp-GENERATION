programa
{
	
	funcao inicio()
	{
		real notas[4] //--> Vetor [] com 4 posições
		real soma = 0.0, media = 0.0 // --> 2 varioáveis reais comuns

		inteiro i // --> uma variável inteira para manupular o laço -- Para

		escreva("Digite as quatro notas do Aluno: \n")
		para(i = 0; i <= 3; i++){
			escreva("Nota: " + (i+1) + "º: ")
			leia(notas[i]) //-->input na posição 0... na próxima 1... na próxima 2... etc
			soma = soma + notas[i]
		}
		media = soma / 4 //i ou 4
		
		escreva("A soma dos valores é: " + soma + "\n")
		escreva("A média das notas é: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 7, 5}-{soma, 7, 7, 4}-{media, 7, 19, 5}-{i, 9, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */