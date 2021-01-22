package exercicioReinoAnimal;

public class Animal {
	//ATRIBUTOS
	private String nome;
	private int idade;
	
	//CONSTRUTOR
	public Animal(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//METODOS
	public void emitirSom()
	{
		System.out.println();
	}


}
