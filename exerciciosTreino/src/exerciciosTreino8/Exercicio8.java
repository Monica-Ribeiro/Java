package exerciciosTreino8;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		//EXEMPLO DE COMO LIMPAR O BUFFER DE LEITURA CONSUMINDO A QUEBRA DE LINHA QUE FICA PENDENTE
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //AQUI A QUEBRA DE LINHA PENDENTE SERA PREENCHIDA PELO NEXTLINE
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
