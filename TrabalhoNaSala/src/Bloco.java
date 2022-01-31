
public class Bloco {
	
	private String nomebloco;
	private String curso;
	private boolean lab;
	private int andares;
	
	
	public String getNomebloco() {
		return nomebloco;
	}
	public void setNomebloco(String nomebloco) {
		this.nomebloco = nomebloco;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public boolean getLab() {
		return lab;
	}
	public void setLab(boolean lab) {
		this.lab = lab;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	
	public void status() {
		
		System.out.println("nome do bloco: " + this.getNomebloco()); 
		System.out.println("curso do bloco: " + this.getCurso());
		System.out.println("laboratorio " + getLab());
		System.out.println("quantos andares? " + this.getAndares());
	}
	
	
}





