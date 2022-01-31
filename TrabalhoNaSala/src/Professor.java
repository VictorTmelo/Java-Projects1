
public class Professor extends Pessoa{
	
	private String especializacao;
	private boolean mestrado;
	private boolean doutorado;
	
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public boolean getMestrado() {
		return mestrado;
	}
	public void setMestrado(boolean mestrado) {
		this.mestrado = mestrado;
	}
	public boolean getDoutorado() {
		return doutorado;
	}
	public void setDoutorado(boolean doutorado) {
		this.doutorado = doutorado;
	}
	
public void status() {
		
		System.out.println("nome do professor : " + this.getNome());
		System.out.println("especialização: " + this.getEspecializacao());
		System.out.println("mestrado: " + this.getMestrado());
		System.out.println("doutorado: " + this.getDoutorado());
		System.out.println("idade: " + this.getIdade());
		System.out.println("altura: " + this.getAltura());
		System.out.println("peso: " + this.getPeso());
	}
	
	
}
