
public class ListaEstatica {

	private int[] v;
	
	private int tamanho;
	
	
	public ListaEstatica(int n) {
		
		v = new int[n];
		
		tamanho = 0;
		
	}
	
	public void adicionar(int valor) {
		
		if(tamanho < v.length) {
			
			v[tamanho] = valor;
			
			tamanho++;
		}else {
			
			System.out.println("Lista cheia!");
			
		}
		
		
		
	}
	

	public void adicionarPos(int valor, int pos) {
		
		
		if(pos < v.length) {
			
			
			for(int p = tamanho; p > pos; p--) {
				
				
				v[tamanho] = v[tamanho - 1];
				
				v[pos] = valor;
				
				tamanho++;
						
						
			}
			
			
			
		}
		
		
	}
	
	
	
	public void adicionarInicio(int valor) {
		
		adicionarPos(valor, 0);
		
	}
	
	
	
	
	public void imprimir() {
		
		for(int i = 0; i < tamanho; i++) {
			
			System.out.println(v[i]);
			
		}
		
		
		
		
	}
	
	
}
