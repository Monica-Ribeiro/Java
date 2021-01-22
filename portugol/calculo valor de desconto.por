programa
{
	
	funcao inicio()
	{
		real valorCompra, desconto
		escreva("Qual o valor da compra? ")
		leia (valorCompra)
		

		se (valorCompra >= 100 e valorCompra < 500)
		{
			escreva("Você ganhou 10% de desconto ")
			desconto=(valorCompra*10)/100
			escreva("\nO valor final da compra foi: ", valorCompra-desconto)
		}
		senao se (valorCompra >= 500 e valorCompra < 1000)          
		{
			escreva("Você ganhou 20% de desconto ")
			desconto=(valorCompra*20)/100
	     	escreva("\nO valor final da compra foi: ", valorCompra-desconto)	
		}
		senao se (valorCompra >= 1000)
		{
			escreva("Você ganhou 30% de deconto ")
			desconto=(valorCompra*30)/100
			escreva("\nO valor final da compra foi: ", valorCompra-desconto)	
		}
		senao se (valorCompra < 100)
		{
			escreva("Você não tem direito ao desconto ")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */