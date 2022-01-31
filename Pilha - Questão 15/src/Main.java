import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Pilha pilha = new Pilha();
		
		String texto;
	
		System.out.print("Digite a expressão: ");
		texto = sc.next();
		
		char [] v = texto.toCharArray();
		
		for(int i = 0; i < v.length; i++){
			
			if(v[0] == ')') {
				
			 	pilha.p = false;
			 	
			 	
			}
			
			if(v[i] == '(') {
				
				pilha.adicionar();
				
			}
			
			
			if(v[i] == ')') {
				
				pilha.excluir();
				
			}
			
			
		}
		
		pilha.verifica();
		
	}

}
