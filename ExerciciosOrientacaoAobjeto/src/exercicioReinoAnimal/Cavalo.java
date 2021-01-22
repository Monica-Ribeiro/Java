package exercicioReinoAnimal;

public class Cavalo extends Animal {
	//CONTRUTOR
	public Cavalo(String nome,int idade)
	{
		super(nome,idade);
	}
	
	//METODOS
	@Override
	public void emitirSom()
	{
		System.out.println("Relinchar");
		
	}
	
	public void correr()
	{
		System.out.println("Correr");
	}

}
