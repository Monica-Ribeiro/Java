package exerciciosEmJava;

import java.util.Scanner;

public class ExercicioLacoCondicional {
	
	//1- Faça um programa que receba três inteiros
	//e diga qual deles é o maior.
	
	public static void main (String [] args) {
	Scanner leia = new Scanner(System.in);
	int valor1, valor2, valor3;
	
	System.out.println("Digite o primeiro valor : ");
	 valor1 = leia.nextInt();
	
	System.out.println("Digite o segundo valor : ");
	valor2 = leia.nextInt();
	
	System.out.println("Digite o terceiro valor: ");
	valor3 = leia.nextInt();
	
	if ((valor1>=valor2) && (valor1>=valor3))
	{
		System.out.printf("O valor 1 é %d e o maior. ", valor1 );
	}
	
	else if (valor2>=valor1 && valor2>=valor3)
	{
		System.out.printf("O valor 2 é %d e o maior. ",valor2 );
	}
	
	else
	{
		System.out.printf("O valor 3 é %d e o maior. ",valor3 );
	}
	
	}


}
