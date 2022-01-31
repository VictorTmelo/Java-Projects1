
public class Pilha {

	private No primeiro;
	private No ultimo;
	
	public Pilha() {
		
		primeiro = null;
		ultimo = null;
				
	}
	
	
	public void adicionar(int n) {
		
		No novo = new No(n);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		}else {
			
			novo.setProximo(primeiro);
			primeiro = novo;
			
		}
		
		
	}
	
	
	
	public No buscar(int pos) {
		
		int i = 1;
		
		No aux = primeiro;
		
		while(i < pos) {
			
			aux = aux.getProximo();
			
			i++;
			
		}

		return aux;
		
	}
	
}             