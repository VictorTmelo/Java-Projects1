package Model;

public class CallOfDuty implements Jogo {

	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Call Of Duty:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
		
	}
	
	public void calcularPreço(String tipo , int quantidade) {
		
		if(tipo == "Black Ops 4" || tipo == "BO4") {
			
			this.preço = 300 * quantidade;
		}
		
        if(tipo == "Black Ops 3" || tipo == "BO3") {
			
			this.preço = 250 * quantidade;
		}
        
        if(tipo == "World War 2" || tipo == "WW2") {
			
			this.preço = 200 * quantidade;
		}
        
        if(tipo == "Infinity Warfare" || tipo == "IW") {
			
			this.preço = 175 * quantidade;
		}
        
        if(tipo == "Advanced Warfare" || tipo == "AW") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "Black Ops 2" || tipo == "BO2") {
			
			this.preço = 125 * quantidade;
		}
        
        if(tipo == "Black Ops 1" || tipo == "BO1") {
			
			this.preço = 100 * quantidade;
		}
        
        if(tipo == "Modern Warfare 3" || tipo == "MW3") {
			
			this.preço = 75 * quantidade;
		}
        
        if(tipo == "Modern Warfare 2" || tipo == "MW2") {
			
			this.preço = 50 * quantidade;
		}
        
        
		
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
