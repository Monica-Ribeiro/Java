package loja;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ExercicioEstoqueLoja {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Collection<String> estoque = new ArrayList();
		
	    String armazenarEstoque;
	    int opcaoEntrada;
		
		System.out.println("Oque você quer fazer no estoque ?\nOpções\n1-Armazenar dados da list\n2-Remover dados da list\n3-Atualizar dados da list\n4-Apresentar todos os dados da list. ");
		opcaoEntrada = leia.nextInt();
		if (opcaoEntrada==1)
		{
			System.out.println("Digite o nome da peça: ");
			armazenarEstoque = leia.next();
			
			estoque.add(armazenarEstoque);
			

			
		}
		else if(opcaoEntrada==2)
		{
			System.out.println("Digite o nome da peça a ser retirada: ");
			armazenarEstoque = leia.next();
			estoque.remove(armazenarEstoque);
		}
		else if(opcaoEntrada==3)
		{	
			estoque.clear();
			System.out.println("Atualizar os dados da lista ");
			armazenarEstoque = leia.next();
			estoque.add(armazenarEstoque);
			
		}
		else if(opcaoEntrada==4)
		{
			System.out.println("Apresentar todos os dados da lista ");
			for (String s:estoque)
				System.out.println(s);
		}
			
	}

}

