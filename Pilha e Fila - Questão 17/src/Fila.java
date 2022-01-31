
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
			
		} else {
			
		No aux = primeiro;
		
		while(aux != null) {
				
			aux = aux.getProximo();
				
		}
		
		if(primeiro == aux) {
			
			novo.setProximo(primeiro);
			primeiro.setAnterior(novo);
			primeiro = novo;
			
		} else if(aux == null) {
			
			ultimo.setProximo(novo);
			novo.setAnterior(ultimo);
			ultimo = novo;
			
		} 
  } 
		
	}
	

	public void excluir() {
		
		No aux = ultimo;
		
		if(primeiro == null) {
			
			
		}else {
			
			ultimo = ultimo.getAnterior();
			ultimo.setProximo(null);
			
		}
		

	}
	
	public void exibir() {
		
		No aux = primeiro;
		
		while(aux != null) {
			
			System.out.print(aux.getNumero() + " ");
			aux = aux.getProximo();
			
		}
		
		
		
	}
	
	
	public No getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}


	public No getUltimo() {
		return ultimo;
	}


	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	
}
