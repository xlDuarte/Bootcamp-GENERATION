programa
{
	//7)	Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	funcao inicio()
	{
		//Inserir as variaveis
		real base, altura
		real area

		escreva("Digite o valor da base do triângulo? ")
		leia(base)

		escreva("Qual o valor da altura do triângulo? ")
		leia(altura)

		area = base * altura / 2

		//Condicionais
		se(base > 0 e altura > 0){
			escreva("\n" + "Positivo. A área do triângulo é de " + area)
		}
		senao se(base <= 0 ou altura <= 0){
			escreva("\n" + "O valor indicado é menor do que zero, seja ele de base " + base + " ou altura " + altura + ". Portanto é inválido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */