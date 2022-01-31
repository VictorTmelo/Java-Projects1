import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack stack = new Stack();
		
		int x;
		
		int y;
		
		System.out.println("Quais numeros desejas adicionar na pilha:");
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Numero: ");
			x = sc.nextInt();
			stack.adicionarNaPilha(x);
			
			
		}
		
		
		System.out.println("Quais numeros desejas adicionar na fila:");
		
		for(int j = 0; j < 5; j++) {
			
			System.out.println("Numero: ");
			y = sc.nextInt();
			stack.adicionarNaFila(y);
			
			
		}
		
		System.out.println(" ");
		
		stack.compararIguais();
		
		System.out.println(" ");
		
		stack.compararDiferentesPilha();
		
		System.out.println(" ");
		
		stack.compararDiferentesFila();
		

	}

}
