
import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Lista lista = new Lista();
		
		int pos = 0;

		System.out.println("Digite um nome: ");
		String nome = teclado.nextLine();
		
		
		System.out.println("Voce deseja criptotografar ou descriptografar " + nome);
		String escolha = teclado.next().toLowerCase();
		
		
		if(escolha.equals("criptografar")) {
			
			System.out.println("Digite a chave de criptografia: ");
			
		}
		
        if(escolha.equals("descriptografar")) {
			
			System.out.println("Digite a chave de descriptografia: ");
			
		}
        
		
		int chave = teclado.nextInt();
		
		lista.adicionar(nome, chave, escolha);
		
		lista.exibir();
		
	
	
	}
	

	
}


