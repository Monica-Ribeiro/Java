package exerciciosEmJava;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int valor;
			
			System.out.print("Digite um n�mero: ");
			valor = scan.nextInt();
			
			if(valor>=0){
				if(valor==0) {
					System.out.println("O n�mero digitado foi o Zero.");
				}else if(valor%2==0) {
					System.out.println("O n�mero � par.");
				}else {
					System.out.println("O n�mero � �mpar.");
				}
			}else {
				System.out.println("O n�mero digitado � menor que zero.");
			}

	}
}
