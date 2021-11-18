programa
{
	
	// 1) A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
	//a)	média do salário da população; 
	//b)	média do número de filhos; 
	//c)	maior salário; 
	//d)	percentual de pessoas com salário até R$ 100,00.

	funcao inicio()
	{
		//Início das variáveis
		real salario, somasalario = 0.0, somanfilhos = 0.0,
			mediasalario, medianfilhos, maiorsalario = 0.0, 
			perc100, cont100 = 0.0

		inteiro nfilhos, hab = 20, x

		para(x=1; x <= hab; x++){

			escreva("Digite o salário do habitante: ")
			leia(salario)
			
			escreva("Digite a quantidade de filhos: ")
			leia(nfilhos)

			somasalario = somasalario + salario
			somanfilhos = somanfilhos + nfilhos

			se(salario > maiorsalario){
				maiorsalario = salario
			}
			se(salario <= 100){
				cont100++
			}
						
		}
		mediasalario = somasalario / hab
		medianfilhos = somanfilhos / hab

		perc100 = (cont100*100) / hab

		escreva("\n" + "A média salarial dos habitantes é: " + mediasalario)
		escreva("\n" + "A média de filhos habitantes é: " + medianfilhos)
		escreva("\n" + "O maior salário é: " + maiorsalario)
		escreva("\n" + "A porcentagem de habitantes até R$ 100,00 é: " + perc100 + "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 957; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */