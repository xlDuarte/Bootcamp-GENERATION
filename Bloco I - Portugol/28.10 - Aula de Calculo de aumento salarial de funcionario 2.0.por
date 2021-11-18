programa
{
	
	funcao inicio()
	{

		//Declaração de Variáveis
		real salario
		real aumento = 0.0
		inteiro codigo

		escreva("Digite o salario do funcionário: ")
		leia(salario)


		escreva("Digite o código do funcionário: ")
		leia(codigo)

		//Condicionais
		// "ou" condição 1 ou outro "e" se forem iguais, codigo 1 e codigo 2
		se(codigo == 1){
			aumento = salario + (salario * 0.05)
		}
		senao se(codigo == 2) {
			aumento = salario + (salario * 0.10)
		}
		senao se(codigo == 3) {
			aumento = salario + (salario * 0.15)
		}
		senao se(codigo == 4) {
			aumento = salario + (salario * 0.20)
		}
		se(codigo !=1 e codigo !=2 e codigo !=3 e codigo!=4) {
			escreva("Código Inexistente!")
		}
		
		senao{
		escreva("\n", "O salário antigo era de : R$ ", salario)
		escreva("\n", "O salário novo do funcionário de código: ", codigo, " é: R$ ", aumento)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */