package Model;

public class CallOfDuty implements Jogo {

	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Call Of Duty:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		
		
	}
	
	public void calcularPre�o(String tipo , int quantidade) {
		
		if(tipo == "Black Ops 4" || tipo == "BO4") {
			
			this.pre�o = 300 * quantidade;
		}
		
        if(tipo == "Black Ops 3" || tipo == "BO3") {
			
			this.pre�o = 250 * quantidade;
		}
        
        if(tipo == "World War 2" || tipo == "WW2") {
			
			this.pre�o = 200 * quantidade;
		}
        
        if(tipo == "Infinity Warfare" || tipo == "IW") {
			
			this.pre�o = 175 * quantidade;
		}
        
        if(tipo == "Advanced Warfare" || tipo == "AW") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "Black Ops 2" || tipo == "BO2") {
			
			this.pre�o = 125 * quantidade;
		}
        
        if(tipo == "Black Ops 1" || tipo == "BO1") {
			
			this.pre�o = 100 * quantidade;
		}
        
        if(tipo == "Modern Warfare 3" || tipo == "MW3") {
			
			this.pre�o = 75 * quantidade;
		}
        
        if(tipo == "Modern Warfare 2" || tipo == "MW2") {
			
			this.pre�o = 50 * quantidade;
		}
        
        
		
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPre�o() {
		return pre�o;
	}

	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
