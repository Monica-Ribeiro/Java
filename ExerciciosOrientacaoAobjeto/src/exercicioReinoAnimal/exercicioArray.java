/*Crie um la�o de repeti��o que percorra uma matriz mostrando os meses do ano e os dias de cada mes.
 * obs: considere todos os meses com 30 dias
 * 
 * 
 * 
 * exemplo de sa�da:
 * 1� mes
 * 	dia 1
 * 	dia 2
 * 	.
 * 	.
 * 	.
 * 	dia 30
 * 2� mes
 * 	dia 1
 * 	dia 2
 * 	.	
 * 	.
 * 	.*/

package exercicioReinoAnimal;

import java.util.Scanner;

public class exercicioArray {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int numero = leia.nextInt();
		for (int i = 0; i <= numero; i++) {
			if (i%2 == 1) {
				System.out.println(i);
				
			}
		}
	}
}
