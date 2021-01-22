package exercicioReinoAnimal;

public class AnimalTeste {
	
	public static void main(String[]args) {
		
		Cachorro rex = new Cachorro("rex",3);
		
		Cavalo max = new Cavalo("max",5);
		
		Preguica charlie = new Preguica("charlie",2);
		
		rex.emitirSom();
		max.emitirSom();
		charlie.emitirSom();
		
	}
	
}
