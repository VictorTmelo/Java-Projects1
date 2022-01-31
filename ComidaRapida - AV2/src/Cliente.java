
public class Cliente {

	private String nome;
	private String endere�o;
	private int telefone;
	private String referencia;
	private boolean ativo;
	
	public void status() {
		System.out.println("|----------------------------------------|");
		System.out.println("|Cliente: " + getNome() + "                              |");
		System.out.println("|Endere�o: " + getEndere�o() + "                             |");
		System.out.println("|Telefone: " + getTelefone() + "                             |");
		System.out.println("|Refer�ncia: " + getReferencia() + "                           |");
		setAtivo(true);
		if(ativo == true) {
			System.out.println("|Ativo?: Sim                             |");
		}
		
	}
	
	public Cliente() {
		
		this.setAtivo(false);
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	public String getEndere�o() {
		
		return endere�o;
		
	}
	public void setEndere�o(String endere�o) {
		
		this.endere�o = endere�o;
		
	}
	public int getTelefone() {
		
		return telefone;
		
	}
	public void setTelefone(int telefone) {
		
		this.telefone = telefone;
		
	}
	public String getReferencia() {
		
		return referencia;
		
	}
	public void setReferencia(String referencia) {
		
		this.referencia = referencia;
		
	}
	public boolean getAtivo() {
		
		return ativo;
		
	}
	public void setAtivo(boolean ativo) {
		
		this.ativo = ativo;
		
	}
	
	

	
}
