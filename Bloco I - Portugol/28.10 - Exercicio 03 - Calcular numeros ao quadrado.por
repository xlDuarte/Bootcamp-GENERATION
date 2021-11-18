programa
{
	inclua biblioteca Matematica --> mat
/* 
3)Desenvolva um sistema em que:
Leia 4 (quatro) números; Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize; Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

	funcao inicio()
	{
		// Inserir variáveis
		inteiro n1, n2, n3, n4
		inteiro r1, r2, r3, r4

		escreva("Digite o número 1: ")
		leia(n1)
		
		escreva("Digite o número 2: ")
		leia(n2)
		
		escreva("Digite o número 3: ")
		leia(n3)
		
		escreva("Digite o número 4: ")
		leia(n4)

		r1 = mat.potencia(n1, 2)
		r2 = mat.potencia(n2, 2)
		r3 = mat.potencia(n3, 2)
		r4 = mat.potencia(n4, 2)

		se(r3 >= 1000){
			escreva("O resultado de " + n3 + "² = " + r3)
		}
		senao{
			escreva("\n" + n1 + "² = ", r1)
			escreva("\n" + n2 + "² = ", r2)
			escreva("\n" + n3 + "² = ", r3)
			escreva("\n" + n4 + "² = ", r4)
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */