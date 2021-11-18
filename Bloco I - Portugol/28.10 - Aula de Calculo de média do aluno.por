programa
{
	
	funcao inicio()
	{

	//Laço condicional simples e composto ---> Resulado média aritmética

	//1º Passo: Declaração de variáveis
	real nota1, nota2, nota3, nota4, media

	escreva("Digite a 1ª nota do aluno: ")
	leia(nota1)

	escreva("Digite a 2ª nota do aluno: ")
	leia(nota2)

	escreva("Digite a 3ª nota do aluno: ")
	leia(nota3)

	escreva("Digite a 4ª nota do aluno: ")
	leia(nota4)

	media = ((nota1 + nota2 + nota3 + nota4) / 4)

	escreva("\n", "Sua média foi de: ", media)

	//Condição "se", "senao se" e "senao"
	se(media >= 7.0) {
		
		escreva("\n", "Parabéns, você foi aprovado! ")
	}
	senao se(media >= 3.0 e media < 7.0){
		
		escreva("\n", "Você está de recuperação! ")

	}
	senao {
		escreva("\n", "Infelizmente você foi reprovado! ")
	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */