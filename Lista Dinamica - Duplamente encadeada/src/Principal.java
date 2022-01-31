import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
			
		int escolha = 0;
		
		ListaDinamica lista = new ListaDinamica();	
		
			
	 while(escolha != 9) {
				
		 System.out.println("\n1. Adicionar elementos na lista no inicio");
			System.out.println("3. Consultar a lista do inicio ao fim");
			System.out.println("4. Consultar a lista do fim ao inicio");
			System.out.println("5. Buscar pela posição");
			System.out.println("6. Buscar pelo numero");
			System.out.println("7. Remover pela posição");
			System.out.println("8. Remover pelo numero");
			System.out.println("9. Sair");
			
			escolha = teclado.nextInt();
	
			if(escolha == 1) {
				
				System.out.println("Digite um numero para adicionar na lista.");
				int add = teclado.nextInt();
				lista.adicionar(add);
				

			}
			
	
			
			if(escolha == 3) {
		
				
				lista.imprimir();
				

			}
			if(escolha == 4) {
				
	     //      lista.exibirFimInicio();
				

			}
			if(escolha == 5) {
				
				System.out.println("Digite a posicao que deseja buscar: ");
				lista.buscarPos(teclado.nextInt());
				
				
			}
			if(escolha == 6) {
				
				System.out.println("Digite o numero que deseja buscar: ");
				lista.buscarNum(teclado.nextInt());
				
				
			}
            if(escolha == 7) {
				
				System.out.println("Digite a posicao que deseja remover: ");
				lista.removerPos(teclado.nextInt());
				
				
			}
            if(escolha == 8) {
				
				System.out.println("Digite o numero que deseja remover: ");
				lista.removerNum(teclado.nextInt());
				
				
			}
           
			
			
	 }

}
	
}
