package exerciciosEmJava;

import java.util.Scanner;

public class ExercicioCategoriaIdade {
	
	//3- Faça um programa que receba
	//a idade de uma pessoa e mostre
	//na saida em qual
	//categoria ela se encontra:
	// 10-14 infantil
	// 15-17 juvenil
	// 18-25 adulto

	public static void main (String [] args) {
		
	Scanner leia = new Scanner (System.in);
	int idade;
	 System.out.print("Digite sua idade: ");
	
	 idade = leia.nextInt();
	
	 if (idade>=10 && idade<=14)
	 {
		 System.out.print("Você está na categoria infantil. ");
	 }
	
	 else if (idade>=15 && idade<=17 )
	 {
		 System.out.print("Você está na categoria juvenil.");
	 }
	
	 else if (idade >=18 && idade <=25)
	 {
		 System.out.print("Você está na categoria adulto.");
	 }

	}
}
