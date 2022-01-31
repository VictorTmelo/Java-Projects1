
public class NoSimples {

	private int numero;
	private NoSimples proximo;
	
	public NoSimples(int numero) {
	
		this.numero = numero;
		this.proximo = null;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public NoSimples getProximo() {
		return proximo;
	}
	public void setProximo(NoSimples proximo) {
		this.proximo = proximo;
	}
	
	
}
