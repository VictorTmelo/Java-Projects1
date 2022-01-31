
public class No {

	private char letra;
	private char cripto;
	No proximo;
	No anterior;
	
	
	
	public No(char letra, char cripto) {
		
		this.letra = letra;
		this.cripto = cripto;
		anterior = null;
		proximo = null;
		
	}
	
	
	
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public char getCripto() {
		return cripto;
	}
	public void setCripto(char cripto) {
		this.cripto = cripto;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	
}
