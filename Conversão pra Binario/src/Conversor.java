import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
	Conversao x = new Conversao();
	
	System.out.println("digite um numero para ser convertido: ");
	x.setNumero(sc.nextInt());
		
    
    System.out.println("sua conversão em binario é: ");
    
	x.converter();
	
	
	}


}