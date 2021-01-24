package exerciciosTreino6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//EXEMPLO DE LEITURA COM VARIOS CARACTERES
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 String x;
		 int y;
		 double z;
		 
		 x = sc.next();
		 y = sc.nextInt();
		 z = sc.nextDouble();
		 
		 System.out.println("Dados digitados: ");
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	}

}
