
public class Fila {

	private No primeiro;
	private No ultimo;
	
	public Fila() {
		
		primeiro = null;
		ultimo = null;
		
	}
	
	
	public void adicionar(int n) {
		
		No novo = new No(n);
		
		if(primeiro == null) {
			
			primeiro = novo;
			
			ultimo = novo;
			
		}else {
			
			ultimo.setProximo(novo);
			
			ultimo = novo;
			
		}
		
		
	}
	
	
	
	public No buscar(int pos) {
		
		int i = 1;
		
		No aux  = primeiro;
		
		while(i < pos) {
			
			aux = aux.getProximo();
			
			i++;
			
		}
		
		return aux;
	
	}
	
	
}
