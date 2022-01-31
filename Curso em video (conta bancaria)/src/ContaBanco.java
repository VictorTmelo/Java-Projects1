
public class ContaBanco {

	public int num;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
    public ContaBanco() {
	
    this.setSaldo(0);
    this.setStatus(false);
   
	}

    
    public void estadoAtual() {
    	
    	System.out.println("-----------------------------------");
    	System.out.println("Numero da conta: " + this.getNum());
    	System.out.println("Tipo da conta: " + this.getTipo());
    	System.out.println("Nome do dono da conta: " + this.getDono());
    	System.out.println("Saldo da conta: " + this.getSaldo());
    	System.out.println("Status da conta: " + this.getStatus());
    	System.out.println("-----------------------------------");
    	
    }
    
    
	
	public void abrirConta(String t) {
		
	this.setTipo(t);
	this.setStatus(true);
	
	if(t == "cc") {
		
	this.setSaldo(50);
	
	}
	
	if(t == "cp") {
		
	this.setSaldo(150);	
		
	}
	
    System.out.println("Conta aberta com sucesso.");
	
	}
	
	
	public void fechaConta() {
		
	if(this.getSaldo() > 0) {
		
		System.out.println("A conta ainda tem dinheiro.");
			
	}
		
	if(this.getSaldo() < 0) {
		
		System.out.println("Conta em debito.");
	}
	
	if(this.getSaldo() == 0) {
		
	this.setStatus(false);
	
	System.out.println("Conta fechada com sucesso.");
	}
	
	}
	

	public void depositar(float v) {
		
	if(this.getStatus() == true) {
		
		this.setSaldo(this.getSaldo() + v);
		// this.saldo = this.saldo + v
		System.out.println("Deposito realizado com sucesso.");
	}
	else {  
		
		System.out.println("Impossivel depositar.");
		
	}
		
	}
	
	
	public void sacar(float v) {
		
	if(this.getStatus() == true) {
		
		if(this.getSaldo() >= v) {
			
			this.setSaldo(this.getSaldo() - v);
			
			System.out.println("Saque realizado com sucesso.");
		}
		else {
			
			System.out.println("Saldo Insuficiente.");
		}
		
		
	}
	
	if(this.getStatus() == false) {
		
		System.out.println("Impossivel sacar.");
	}
		
	}
	
	
	public void pagarMensal() {
		
		int m = 0;
		
	if(this.getTipo() == "cc") {
		
		m = 12;
	}
		
	if(this.getTipo() == "cp") {
		
		m = 20;
	}
	
	if(this.getStatus() == true) {
		
		if(this.getSaldo() > m) {
			
			this.setSaldo(this.getSaldo() - m);
			
			System.out.println("Mensalidade paga com sucesso.");
		}
		else {
			
			System.out.println("Saldo insuficiente.");
			
		}
	}
	else {
		
		System.out.println("Impossivel pagar.");
	}
	
}


	public int getNum() {
		return num;
	}






	public void setNum(int num) {
		this.num = num;
	}






	public String getTipo() {
		return tipo;
	}






	public void setTipo(String tipo) {
		this.tipo = tipo;
	}






	public String getDono() {
		return dono;
	}






	public void setDono(String dono) {
		this.dono = dono;
	}






	public float getSaldo() {
		return saldo;
	}






	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}






	public boolean getStatus() {
		return status;
	}






	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
				
}
