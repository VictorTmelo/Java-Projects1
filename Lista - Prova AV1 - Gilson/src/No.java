
public class No {

	private String tipo;
	private double potencia;
	private int quantidade;
	private double tempo;
	private No proximo;
	
	
	public No(String tipo, double potencia, int quantidade, double tempo) {
		
		this.tipo = tipo;
		this.potencia = potencia;
		this.quantidade = quantidade;
		this.tempo = tempo;
		proximo = null;
		
		
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}
