
public class ContaPoupanša extends Conta {

	
	
    public ContaPoupanša() {
		
		this.setSaldo(0);
		this.setStatus(false);
		
	}
	
	
	
	
	public void abrirConta() {
		
		this.setStatus(true);
		
		System.out.println("Conta aberta com sucesso.");
		
		
	}

	
	
	
	
}
