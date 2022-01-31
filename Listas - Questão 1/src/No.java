
public class No {

	private String codigo;
	private double preco;
	private int quant;
	private No prox;
	
	
	public No(String c, double p, int q) {
		
		this.codigo = c;
		this.preco = p;
		this.quant = q;
		this.prox = null;
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuant() {
		return quant;
	}


	public void setQuant(int quant) {
		this.quant = quant;
	}


	public No getProx() {
		return prox;
	}


	public void setProx(No prox) {
		this.prox = prox;
	}

	
}
