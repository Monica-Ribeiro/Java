package exerciciosTreino9;

public class Exercicio9 {
	public static void main(String[] args) {
		// EXEMPLOS DE FUNÇÕES MATEMATICAS

		// VARIAVEIS
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		// A RECEBE RAIZ QUADRADA DE X QUE VALE 3.0;
		// B RECEBE RAIZ QUADRADA DE Y QUE VALE 4.0;
		// C RECEBE RAIZ QUADRADA DE 25.0
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + 25.0 + " = " + C);

		// A RECEBE POTENCIAÇÃO DE X,Y OU SEJA X ELEVADO A Y ;
		// B RECEBE X ELEVADO AO QUADRADO;
		// C RECEBE 5.0 ELEVADO AO QUADRADO
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + "Elevado a " + y + " = " + A);
		System.out.println(x + "Elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado " + C);

		// A RECEBE O VALOR ABSOLUTO DE Y;
		// B RECEBE O VALOR ABSOLUTO DE Z
		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + x + " = " + B);

	}

}
