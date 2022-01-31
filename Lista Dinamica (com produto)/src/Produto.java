
public class Produto {

	private String codigo;
	private double preco;
	private int quant;
	
	
	
	public Produto(String c, double p, int q) {
		
		this.codigo = c;
		this.preco = p;
		this.quant = q;
		
		
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


	
	
}
