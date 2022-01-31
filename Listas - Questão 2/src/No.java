
public class No {

	private String nome;
	private double salario;
	private No proximo;
	
	
	public No(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		proximo = null;
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	

	
}
