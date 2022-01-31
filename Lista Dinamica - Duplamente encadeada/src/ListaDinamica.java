
public class ListaDinamica {
	
	private No primeiro;
	private No ultimo;
	private int tamanho;

	public ListaDinamica(){
		
		primeiro = null;
		ultimo = null;
		this.tamanho = 0;
	}
	
	public void adicionar(int numero) {
		
		No novo = new No(numero);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
		
			} else {
				
			No aux = primeiro;
			
			while(aux != null && aux.getNumero() < numero) {
				
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
				
			} else {
				
				novo.setProximo(aux);
				aux.getAnterior().setProximo(novo);
				novo.setAnterior(aux.getAnterior());
				aux.setAnterior(novo);
			}
	  } 
		
		tamanho++;
	}
	
	
	public void removerPos(int pos) {
		
		No aux = primeiro;
		No anterior = null;
		int i = 1;
		
		while(i < pos) {
			
			anterior = aux;
			aux = aux.getProximo();
			i++;
		}
		
		if(i == 1) {
			
			primeiro = primeiro.getProximo();
			aux.setProximo(null);
			aux.setAnterior(null);
			
		} else {
			
			anterior.setProximo(aux.getProximo());
			aux.setProximo(null);
			aux.setAnterior(null);
		}
		
		tamanho--;
	}
	
	public void removerNum(int numero) {
		

		No aux = primeiro;
		
		while(aux != null) {
			
			if(aux.getNumero() == numero) {
				
				if(primeiro == aux) {
					
					primeiro = aux.getProximo();
					aux = primeiro;
				}
				
				else if(ultimo == aux) {
					
					ultimo = ultimo.getAnterior();
					ultimo.setProximo(null);
					aux = null;
					
				} else {
					
					
					aux.getProximo().setAnterior(aux.getAnterior());
					aux.getAnterior().setProximo(aux.getProximo());
					aux = aux.getProximo();
					
				}
				
			} else {
				
				aux = aux.getProximo();
			}
		}

		tamanho--;
	}
	
	public void buscarPos(int pos) {
		
		No aux = primeiro;
		int i = 1;
		
		
		while(i < pos) {
			
			aux =aux.getProximo();
			i++;
		}
		
		
		System.out.println("Numero: " + aux.getNumero() + " esta na posicao " + pos);
		
	}
	
	public void buscarNum(int numero) {
		
		
		No aux = primeiro;
		int pos = 0;
		
		
		while(aux != null) {
			
			pos++;
			
			if(aux.getNumero() == numero) {
			
			System.out.println("Numero: " + numero + " esta na posicao " + pos);
			
			}
			
			aux = aux.getProximo();
		}
}
		
		public void imprimir() {
			
			No aux = primeiro;
			
			while(aux != null) {
				
				System.out.print(aux.getNumero() + "\n");
				aux = aux.getProximo();
			}
			
			System.out.println("Tamanho da lista: " + tamanho + " Nós.");
		}
		
		
	}
