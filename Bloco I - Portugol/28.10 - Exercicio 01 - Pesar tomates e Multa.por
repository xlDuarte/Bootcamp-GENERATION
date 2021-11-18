programa
{
/* 
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso.
Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/
	
	funcao inicio()
	{
		// Inserir variáveis
		inteiro multa = 4, excesso
		inteiro pesotomates, pesomulta

		escreva("Qual o peso total dos tomates, em Kg? ")
		leia(pesotomates)

		pesomulta = (pesotomates - 50) * multa
		excesso = pesotomates - 50

		//Condicionais
		se(pesotomates <= 50){
			escreva("\n" + "Dentro do limite. Não há multa." )
		}
		senao{
			escreva("\n" + "O valor pago de multa é: " + pesomulta + " R$ ")
		}
		se(excesso > 0){
			escreva("\n" + "Excesso de peso: " + excesso + "Kg ")
		}
		senao{
			escreva("\n" + "Não há excesso de peso. ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1095; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */