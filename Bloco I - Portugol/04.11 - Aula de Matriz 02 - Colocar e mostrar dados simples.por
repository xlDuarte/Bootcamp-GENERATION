programa {
	
	funcao inicio() {

		real notas[2][2] 

		para(inteiro l = 0; l < 2; l++){
			para(inteiro c = 0; c < 2; c++){
				leia(notas[l][c]) //--> input na Matriz
				
				//escreva("\n")
			}
		}
		para(inteiro l = 0; l < 2; l++){
			para(inteiro c = 0; c < 2; c++){
				escreva(notas[l][c], ", ") //--> Mostra os valores da Matriz para o usário
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 5, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */