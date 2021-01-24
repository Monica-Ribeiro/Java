package exerciciosTreino4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		//EXEMPLO DE LEITURA COM PONTO FLUTUANTE E DUAS CASAS DECIMAIS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou %.2f%n" , x);

		sc.close();
	}
}
