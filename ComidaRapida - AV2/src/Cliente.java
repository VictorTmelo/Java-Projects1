
public class Cliente {

	private String nome;
	private String endereço;
	private int telefone;
	private String referencia;
	private boolean ativo;
	
	public void status() {
		System.out.println("|----------------------------------------|");
		System.out.println("|Cliente: " + getNome() + "                              |");
		System.out.println("|Endereço: " + getEndereço() + "                             |");
		System.out.println("|Telefone: " + getTelefone() + "                             |");
		System.out.println("|Referência: " + getReferencia() + "                           |");
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
	public String getEndereço() {
		
		return endereço;
		
	}
	public void setEndereço(String endereço) {
		
		this.endereço = endereço;
		
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
