
public class Lista {
	
	private No primeiro;
	private No ultimo;
	private int tamanho;
	
	
	public Lista() {
		
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
		
	}
	
	
	
	public void adicionar(int quociente, int expoente) {
		
		No novo = new No(quociente, expoente);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
			tamanho++;
			
		}else {
			
			No aux = primeiro;
			
			No anterior = null;
			
			while(aux != null && aux.getExpoente() > novo.getExpoente()) {
			
				anterior = aux;
				
				aux = aux.getProximo();
		
			}
			
			if(aux == primeiro) {
				
				novo.setProximo(primeiro);
				
				primeiro = novo;
				
				tamanho++;
				
			}else if(aux == null) {
				
				ultimo.setProximo(novo);
				
				ultimo = novo;
				
				tamanho++;
				
			}else {
				
				anterior.setProximo(novo);
				
				novo.setProximo(aux);
				
				tamanho++;
				
			}
			
			
		}
		
		
		
	}
	
	
	public No comparar(No n) {
       
		No aux = primeiro;
		
        while (aux != null && aux.getExpoente() != n.getExpoente()) {
            
        	
        if (aux.getExpoente() == n.getExpoente()) {
            System.out.println("Expoente encontrado!");
            
            
        } else {
        	
            System.out.println("Expoente não encontrado!");
            return null;
            
        }
        
        
        aux = aux.getProximo();
        
        }
        
		return aux;
	
		
    }

	
	
	public void imprimir() {
		
        No aux = primeiro;
        
        while (aux != null) {
        	
            System.out.println("(" + aux.getQuociente() + "x^" + aux.getExpoente() + ")");
            if (aux.getProximo() != null) {
                System.out.println(" + ");
                
            }
            
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


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
