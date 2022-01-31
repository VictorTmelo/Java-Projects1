
public class ContaPoupança extends Conta {

	
	
    public ContaPoupança() {
		
		this.setSaldo(0);
		this.setStatus(false);
		
	}
	
	
	
	
	public void abrirConta() {
		
		this.setStatus(true);
		
		System.out.println("Conta aberta com sucesso.");
		
		
	}

	
	
	
	
}
