package criacao;

import java.util.Random;
import java.util.Scanner;

public class AssistentePessoal {
	
	//ATRIBUTOS
	private String nome;
	private int temperatura;
	
	//CONSTRUTOR
	public AssistentePessoal()
	{
		setNome(null);
		setTemperatura(0);
	}
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void ChamadaDeEmergencia()
	{
		
		System.out.println("Opções\n1-190-Policia Militar.\n2-193-Bombeiros\n3-192-Ambulância. ");
		Scanner escolha = new Scanner(System.in);
		int opcao = escolha.nextInt();
		
	
		if(opcao == 1)
		{
			System.out.println("Você ligou para a policia militar. ");
		}
		else if(opcao == 2)
		{
			System.out.println("Você ligou para o corpo de Bombeiros. ");
		}
		else if(opcao == 3)
		{
			System.out.println("Você ligou para a Ambulância. ");
		}
		else 
		{
			System.out.println("Opção invalida! ");
		}
		
	}
		
	 public void calculaTemperatura()
	 {
		 Random aleatorio = new Random();
		 int temp = 10 + aleatorio.nextInt(30);
		 setTemperatura(temp);
		 
	 }
	
	 public void exibeTemperatura()
	 {
		 if(getTemperatura()== 0) 
		 {
			 calculaTemperatura();
			 System.out.println("A temperatura hoje é: "+ getTemperatura()+"°");
		 }
		 
		 else 
		 {
			 System.out.println("A temperatura hoje é: "+ getTemperatura()+"°");
		 }
	 }
}
	
	

