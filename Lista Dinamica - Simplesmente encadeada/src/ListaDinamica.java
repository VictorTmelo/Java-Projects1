
public class ListaDinamica {
	
	private No primeiro;
	private No ultimo;
	private int tamanho;
	

	public ListaDinamica() {
	
		primeiro = null;
		ultimo = null;
		this.tamanho = 0;
		
	}


	public void adicionar(int valor) {
	
		No novo = new No(valor);
		

		if (primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		}
		else {
			
			ultimo.setProximo(novo);
			ultimo = novo;
			
		}

		tamanho++;
	}

	

	public void adicionarInicio(int valor)
	{
		No novo = new No(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		}
		else {
			novo.setProximo(primeiro);
			primeiro = novo;
		}

		tamanho++;
	}


	
	public void imprimir() {
	
		No aux = primeiro;
		
		while (aux != null) {
			
			System.out.print("Numero: " + aux.getNumero() + "\n");
			aux = aux.getProximo();
			
		}
		
		System.out.println("Tamanho da Lista: " + tamanho + " Nós.");
	}
}
