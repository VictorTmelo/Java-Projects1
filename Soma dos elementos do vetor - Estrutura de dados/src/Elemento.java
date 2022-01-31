
public class Elemento {

	
	public static int soma(int v[],int x) {
		
		if(x < v.length) {
			
			return v[x] + soma(v, x+1);
			
		}
		else {
			
			return 0;
				
			}
			
			
		}
		
	public static void main(String[] args) {
		
		
		int vetor[] = new int[10];
		
		
		Elemento y = new Elemento();
		
		for(int i = 0; i<10; i++) {
			
			vetor[i] = i;
			
		}
		
		
		System.out.println(y.soma(vetor, 0));
		
		
	}

}
