
public class ContaPoupan�a extends Conta {

	
	
    public ContaPoupan�a() {
		
		this.setSaldo(0);
		this.setStatus(false);
		
	}
	
	
	
	
	public void abrirConta() {
		
		this.setStatus(true);
		
		System.out.println("Conta aberta com sucesso.");
		
		
	}

	
	
	
	
}
