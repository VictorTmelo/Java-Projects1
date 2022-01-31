import java.util.Scanner;

public class Quantidade {
public static void main(String[] args) {
		
		
		System.out.println("Digite um numero: ");
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		int aux = numero;
		
		int tamanho = 0;
		
		int i = 0;
		
		int soma = 0;
		
		while(aux!= 0) {
			
			aux = aux/10;
			
			tamanho++;
			
		}
		
		int guarda[] = new int[tamanho];
		
		while(numero!= 0) {
			
			int resto = numero%10;
			
			
			guarda[i] = resto;
			
			i++;
			
			numero = numero/10;
					
		}
		
	
		
		System.out.println("Digite o numero que deseja saber quantas vezes aparece no numero digitado anteriormente");
		
		int vezes = teclado.nextInt();
		
		
		for(int j = 0;j < guarda.length;j++) {
			
			if(vezes == guarda[j]) {
				
				soma = soma + 1;
				
				
			} 
		}
		
		System.out.println("O numero " + vezes + " apareceu " + soma + " vezes");
	}
}
