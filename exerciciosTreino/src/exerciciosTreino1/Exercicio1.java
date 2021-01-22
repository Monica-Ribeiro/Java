package exerciciosTreino1;

import java.util.Locale;

public class Exercicio1 {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender ='f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s whitch price is $ %.2f%n",product1,price1);
		System.out.printf("%s whit price is %.2f%n",product2,price2);
		Locale.setDefault(Locale.US);
		System.out.printf("Measue whitch eigth decimal places: %.5f%n",measure);
		System.out.printf("US decimal point: %.3f",measure);


		
	}

}
