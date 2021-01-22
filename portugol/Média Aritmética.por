programa
{
	
	funcao inicio()
	{
		real media,notas[3], soma = 0.0
		para (inteiro i = 0; i < 3; i++)
		{
			escreva ("Digite o ", (i+1), "ª nota: ")
			leia	(notas[i])
		}

		para(inteiro i= 0; i < 3; i++)
		{
			soma = soma + notas[i]
		}

		media = soma/3
		se (media < 5 )
		{
			escreva("\naluno(a), sua média foi: ",media)
			escreva("\nQue pena, você foi reprovado... ")	
		}senao se (media >= 5)
		{
			escreva("\naluno(a), sua média foi: ",media)
			
			escreva("\nParabéns! você foi aprovado ")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 6, 7, 5}-{notas, 6, 13, 5}-{soma, 6, 23, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */