programa
{
/*
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
*/
	
	funcao inicio()
	{
		//Inserir variaveis
		inteiro codigo, vtotal
		inteiro horaexcedente, horatrabalho, horaextra
		inteiro salario, salariototal

		escreva("Operário, digite seu código: ")
		leia(codigo)

		escreva("Digite a quantia de horas trabalhadas: ")
		leia(horatrabalho)

		salario = 10 * horatrabalho //R$ 10,00 por hora.
		horaexcedente = horatrabalho - 50 //horas exceder a 50 calcule o excesso
		horaextra = horaexcedente * 20 //A hora excedente de trabalho vale R$ 20,00.
		salariototal = (horatrabalho - horaexcedente) * 10
		vtotal = salariototal + horaextra
		
		//Condicionais
		se(horatrabalho > 50) {
			escreva("\n" + "O operário com o código " + codigo + " trabalhou além da sua jornada." )
			escreva("\n" + "A quantia de horas extras trabalhadas foi de: " + horaexcedente + " horas" )
			escreva("\n" + "O valor adicional a ser pago é de: R$ " + horaextra)
			escreva("\n" + "O salário + o adicional de horas extras é de: R$ " + vtotal )
		}
		senao{
			escreva("\n" + "O salário total é de: R$ " + salario )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */