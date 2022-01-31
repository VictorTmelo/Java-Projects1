
public class No {

    private String bloco1;
	private String bloco2;
	private No proximo;
	private No anterior;
	
	
	public No(String bloco1) {
		
		
		this.bloco1 = bloco1;
	
		this.anterior = null;
		this.proximo = null;
	}



	public String getBloco1() {
		return bloco1;
	}



	public void setBloco1(String bloco1) {
		this.bloco1 = bloco1;
	}



	public String getBloco2() {
		return bloco2;
	}



	public void setBloco2(String bloco2) {
		this.bloco2 = bloco2;
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
