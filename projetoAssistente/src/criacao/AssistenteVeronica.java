package criacao;
import java.util.Scanner;
public class AssistenteVeronica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCIAMENTO
		AssistentePessoal veronica = new AssistentePessoal();
		veronica.setNome("Veronica");
		String nomeVeronica= veronica.getNome();
		System.out.println("Ol� meu nome � "+ nomeVeronica);
		System.out.println("Sou sua assistente pessoal.\nOque voc� quer fazer? ");
		while(true)
		{
			System.out.println("Op��es:\n1-Fazer chamada de emergencia.\n2-Saber a temperatura do dia.\n3-Mensagem motivacional. ");
			Scanner escolha = new Scanner(System.in);
			int opcao = escolha.nextInt();
			
			if(opcao == 1) 
			{
				veronica.ChamadaDeEmergencia();
				escolha.close();
				break;
			}
			
			else if(opcao == 2)
			{
				veronica.exibeTemperatura();
				System.out.println();
			}
			else if(opcao == 3)
			{
				System.out.println();
			}
			else 
			{
				System.out.println("Op��o invalida!Tente novamente. ");
			}
		    
		}
	}

}
