
public class No {

	private int numero;
	private No proximo;
	
	public No(int n) {
	
		this.numero = n;
		proximo = null;
		
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
