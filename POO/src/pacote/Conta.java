package pacote;

public class Conta {

	private double saldo;
	private String nome;
	
	public Conta() {
		this.saldo = 0;
		this.nome = null;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if (valor <= this.getSaldo()) {
			contaDestino.setSaldo(valor + contaDestino.getSaldo());
		}
		else {
			System.out.println("Valor insuficiente para realizar a transferencia. ");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
