
public class Aluno extends Pessoa{
	
	private int matricula;
	private int senha;
	private boolean calouro;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean getCalouro() {
		return calouro;
	}
	public void setCalouro(boolean calouro) {
		this.calouro = calouro;
	}
	

	public void status() {
		
		System.out.println("nome do aluno : " + this.getNome());
		System.out.println("matricula: " + this.getMatricula());
		System.out.println("senha: " + this.getSenha());
		System.out.println("idade: " + this.getIdade());
		System.out.println("altura: " + this.getAltura());
		System.out.println("peso: " + this.getPeso());
		System.out.println("calouro: " + this.getCalouro());
	}
	
	
}

