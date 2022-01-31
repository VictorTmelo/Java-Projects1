
public class No {

	private int numero;
	No proximo;
    No anterior;
    

	public No(int numero) {
		
		proximo = null;
		anterior = null;
		this.numero = numero;
		
	}
	
	
	
	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
}
