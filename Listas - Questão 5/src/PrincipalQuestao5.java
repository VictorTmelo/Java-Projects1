import java.util.Scanner;

public class PrincipalQuestao5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ListaSimples1 lista1 = new ListaSimples1();
		ListaSimples2 lista2 = new ListaSimples2();
		ListaDupla lista3 = new ListaDupla();
		
		int numero;
	
		for(int i = 0; i < 20; i ++) {
		
		System.out.println("Digite um numero para adicionar na lista: ");
			
		numero = teclado.nextInt();
		
		lista3.adicionar(numero);
		
	    if(numero%2 == 0) {
	    	
	    	lista1.adicionar(numero);
	    }
	    
	    if(numero%3 == 0 || numero == 1) {
	    	
	    	lista2.adicionar(numero);
	    }
	 }
		
		System.out.println("\nLista com pares: " );
		lista1.exibir();
		System.out.println("");
		
		System.out.println("\nLista com impares: ");
		lista2.exibir();
		System.out.println("");
		
		System.out.println("\nLista Dupla em ordem crescente: ");
		lista3.exibirCrescente();
		System.out.println("");
		
		System.out.println("\nLista Dupla em ordem decrescente: ");
		lista3.exibirDecrescente();

	}


}
