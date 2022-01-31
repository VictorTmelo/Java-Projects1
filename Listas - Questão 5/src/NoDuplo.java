
public class NoDuplo {

	private int numero;
	private NoDuplo proximo;
	private NoDuplo anterior;
	
	
	
	public NoDuplo(int numero) {

		this.numero = numero;
		this.proximo = null;
		this.anterior = null;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public NoDuplo getProximo() {
		return proximo;
	}
	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}
	public NoDuplo getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}
}
