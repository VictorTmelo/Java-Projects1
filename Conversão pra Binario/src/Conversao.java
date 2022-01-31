public class Conversao {
	
	public int numero;
	
	public void converter(){
		
	int i;	
	int n  = numero;
	int m;
	
	while(n>0)
	{
	
	i = n/2;	
	m = n % 2; 
	
	System.out.println(m);
	
    n = i;
		
	}
	  
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

	
}





