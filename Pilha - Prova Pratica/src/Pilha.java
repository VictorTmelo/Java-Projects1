
public class Pilha {

	private No primeiro;
	private No ultimo;
	private int tamanho;
	

	public Pilha() {
		
		primeiro = null;
		ultimo = null;
		
		this.tamanho = 0;
	}
	
	
	
	public void adicionar(int n) {
		
		No novo = new No(n);
		
		if(primeiro == null){
			
			primeiro = novo;
			ultimo = novo;
			
		}else{
			
			novo.setProximo(primeiro);
			primeiro.setAnterior(novo);
			primeiro = novo;
			
		}
		
		tamanho++;
		
	}
	
	public void excluir() {
		
		
		if(primeiro == null) {
			
			System.out.println("Impossivel exlcuir, pilha ja vazia :/");
			
		}else {
			
			primeiro = primeiro.getProximo();
			primeiro.setAnterior(null);
			tamanho--;
		}
		
		
	}
	
	public void exibir() {
		
		
		No aux = ultimo;
		
		while(aux != null) {
			
			System.out.print(aux.getNumero() + " ");
			aux = aux.getAnterior();
			
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



	public int getTamanho() {
		return tamanho;
	}



	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
