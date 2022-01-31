
public class Magico {
	
	public void indice(int s[], int l) {
		
		if(l == 0) {
			
          //PARADA;
          
		}else {
			
			if(s[l-1] == (l - 1)) {
		
				System.out.println(l-1);
				
				indice(s,l-1);
				
			}else {
				
				indice(s,l-1);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
	
		Magico m = new Magico();
		
		int x[] = {-1,1,2,4,7,9};
	
 	    m.indice(x, x.length);
	}

}
