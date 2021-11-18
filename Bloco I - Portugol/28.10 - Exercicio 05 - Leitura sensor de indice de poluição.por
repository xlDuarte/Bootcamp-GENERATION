programa
{
	//7)	5)	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
	//O índice de poluição aceitável varia de 0,05 até 0,25.
	funcao inicio()
	{
		//Inclusão de variáveis
		real ip

		escreva("Leia o indice de poluição: ")
		leia(ip)

		se(ip >= 0.05 e ip <= 0.25){
			escreva("Indice de poluição aceitável! ")
		}
		senao se(ip > 0.25 e ip <= 0.3){
			escreva("Notifique as empresas do 1º grupo. ")
		}
		senao se(ip > 0.3 e ip <= 0.4){
			escreva("Notifique as empresas do 1º e 2º grupos. ")
		}
		senao se(ip > 0.4 e ip <= 0.5){
			escreva("Notifique as empresas de todos os grupos. ")
		}
		senao{
			escreva("Indice sem classificação..." )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */