
public class No {

	private int quociente;
	private int expoente;
	private No proximo;
	
	
	public No(int quociente, int expoente) {
		
		this.quociente = quociente;
		this.expoente = expoente;
		this.proximo = null; 
		
	}
	
	

	public int getQuociente() {
		return quociente;
	}


	public void setQuociente(int quociente) {
		this.quociente = quociente;
	}


	public int getExpoente() {
		return expoente;
	}


	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}


	public No getProximo() {
		return proximo;
	}


	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}
