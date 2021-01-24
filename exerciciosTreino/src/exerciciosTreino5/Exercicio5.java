package exerciciosTreino5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//EXEMPLO DE LEITURA COM 1 CHAR(CARACTERE)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next() .charAt(0);
		System.out.println("Você digitou " + x);
		
		sc.close();
		
		
	}
	
	

}
