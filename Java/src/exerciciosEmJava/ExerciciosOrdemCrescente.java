package exerciciosEmJava;

import java.util.Scanner;

public class ExerciciosOrdemCrescente {
	
//2- Fa�a um programa que entre com tr�s n�meros
//e coloque em ordem crescente.

	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n1, n2 , n3;
		
		System.out.println("Digite um numero: ");
		n1 =leia.nextInt();
		
		System.out.println("Digite mais um numero;");
		n2 = leia.nextInt();
		
		System.out.println("Digite o ultimo numero: ");
		n3 = leia.nextInt();
		
		if ((n1>n2) && (n1>n3))
		{
			System.out.printf("O primeiro numero( %d ) � o maior entre %d %d %d", n1,n1,n2,n3);
		}
		
		else if ((n2>n1) &&(n2>n3))
		{
			System.out.printf("O segundo numero(%d) � o maior entre %d %d %d", n2,n1,n2,n3);
		}
			
		else if ((n3>n1) && (n3>n2))
		{
		System.out.printf("O terceiro numero(%d)� o maior entre %d %d %d", n3,n1,n2,n3);
		}
		
		else
		{
			System.out.print("Existe dois numeros iguais ou mais. ");
		}
		
		leia.close();

	}
}
