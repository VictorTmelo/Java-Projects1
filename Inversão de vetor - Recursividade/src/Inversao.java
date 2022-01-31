//INVERTENDO VETORES RECURSIVAMENTE

import java.util.Arrays;

public class Inversao {

	public  static void inverter(int x[], int i, int l) {
		
		int aux;
		
		if(i < Math.floor(x.length/2) ) {
			
			aux = x[i];
			x[i] = x[l-1];
			x[l-1] = aux;
					
			inverter(x, i+1, l-1);
			
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int p[] = {1,2,3,4,5,6}; 
		
		inverter(p, 0, p.length);
		
		System.out.println("Resultado: " + Arrays.toString(p));
		

	}

}
