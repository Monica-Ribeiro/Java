package exerciciosEmJava;

import java.util.Scanner;

public class DuracaoEvento {
	
	public static void main (String[] args)
	{	Scanner leia = new Scanner (System.in);
		int duracaoEvento, horas = 0, minutos = 0, segundos = 0;
		System.out.println("Informe a duração do evento (em segundos): ");
		duracaoEvento = leia.nextInt();
		horas = duracaoEvento / 3600;
		minutos = (duracaoEvento % 3600)/ 60;
		segundos = (duracaoEvento % 3600) % 60;
		System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		leia.close();

	}
}
