
public class Hash {
	
	public Lista[]hash;
	private int tamanho;
	
	
	
	public Hash(int tam) {
		
		this.tamanho = tam;
	
		hash = new Lista[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			
			hash[i] = new Lista();
			
		}
		
	}
	
	
	public void adicionar(int num) {
		
		int n = num % tamanho;
		
		hash[n].adicionar(num);
		
	
	}
	
	
	public void imprimir() {
		
		for(int i = 0; i < tamanho; i++) {
			
			System.out.print(i);
			System.out.print(" -> ");
			hash[i].imprimir();
			
		
		}
		
		
		
		
	}


	

}
