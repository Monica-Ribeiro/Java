package exercicioReinoAnimal;

public class Cachorro extends Animal {
	//CONTRUTOR
	public Cachorro(String nome,int idade)
	{
		super(nome,idade);
	}
	
	//METODOS
	@Override
	public void emitirSom()
	{
		System.out.println("Latir");
		
	}
	
	public void correr()
	{
		System.out.println("Correr");
	}
	
}
