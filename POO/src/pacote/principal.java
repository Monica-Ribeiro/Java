package pacote;

public class principal {

	public static void main(String[] args) {
		Conta contaMonica = new Conta();
		System.out.println(contaMonica.getNome());
		contaMonica.setNome("monica");
		System.out.println(contaMonica.getNome());
		System.out.println(contaMonica.getSaldo());
		contaMonica.setSaldo(5000);
		System.out.println(contaMonica.getSaldo());
		Conta contaMateus = new Conta();
		contaMonica.transferir(10000, contaMateus);
		System.out.println(contaMateus.getSaldo());
		
	}
}
