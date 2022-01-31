
public class No {

	private String nome;
	private double nota;
	private No proximo;
	private No anterior;
	
	
	public No(String nome, double nota) {
		
		this.nome = nome;
		this.nota = nota;
		proximo = null;
		anterior = null;
		
	}

	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
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
