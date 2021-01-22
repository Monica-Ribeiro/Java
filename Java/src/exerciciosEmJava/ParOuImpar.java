package exerciciosEmJava;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int valor;
			
			System.out.print("Digite um número: ");
			valor = scan.nextInt();
			
			if(valor>=0){
				if(valor==0) {
					System.out.println("O número digitado foi o Zero.");
				}else if(valor%2==0) {
					System.out.println("O número é par.");
				}else {
					System.out.println("O número é ímpar.");
				}
			}else {
				System.out.println("O número digitado é menor que zero.");
			}

	}
}
