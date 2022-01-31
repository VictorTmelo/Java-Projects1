
public class Elemento {

	
	public static int maior(int v[],int x) {
		
		if(x == v.length - 1) {
			
			return v[x];
			
		}
		else {
			
			int m = maior(v, x+1);
		
			if(m > v[x]) {
				
				return m;
				
				
			}
			else {
				
				return v[x];
				
			}
			
		}
		
	
	}
	public static void main(String[] args) {
		
		
		int vetor[] = new int[10];
		
		
		Elemento y = new Elemento();
		
		for(int i = 0; i<10; i++) {
			
			vetor[i] = i;
			
		}
		
		
		System.out.println(y.maior(vetor, 0));
		
		
	}

}
