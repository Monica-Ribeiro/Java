package exercicioReinoAnimal;

public class Preguica extends Animal{
	
	//CONTRUTOR
	public Preguica(String nome,int idade)
	{
		super(nome,idade);
	}
	
	//METODOS
	@Override
	public void emitirSom()
	{
		System.out.println("zzzzzZzZZzz");
		
	}
	
	public void subirEmArvores()
	{
		System.out.println("subir em árvores");
	}
}
