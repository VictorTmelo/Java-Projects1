
public class No {

	Produto prod;
	
	private No prox;
	
	public No(Produto prod) {
		
		this.prod = prod;
	
	}
	
	public No(String c, double p, int q) {
		
		this.prod.setCodigo(c);
		this.prod.setPreco(p);
		this.prod.setQuant(q);
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public No getProx() {
		return prox;
	}


	public void setProx(No prox) {
		this.prox = prox;
	}

	
}
