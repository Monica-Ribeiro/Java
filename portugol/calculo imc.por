programa
{
	
	funcao inicio()
	{
		real peso,altura,imc
		escreva("Digite aqui seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc= peso/(altura*altura)

		se (imc < 18.5)
		{
			escreva("Você está abaixo do peso ")	
		}
		senao se (imc >= 18.5 e imc <= 24.9)
		{   	
		 	escreva("Você está com peso normal ")	     	
		}
		senao se (imc >= 24.9 e imc <= 29.9)
		{
		 	escreva("Você está com sobrepeso ")
		}
		senao se (imc > 30 e imc < 34.9)
		{
			escreva("Você está com obesidade grau 1 ")
		}
		senao se (imc > 30 e imc < 39.9)
		{
			escreva("Você está com obesidade grau 2 ")
		}
		senao se (imc > 40)
		{
			escreva("Você está com obesidade mórbida ")
		}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */