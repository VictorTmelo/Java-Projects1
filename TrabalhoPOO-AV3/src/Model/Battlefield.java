package Model;

public class Battlefield implements Jogo {
	
	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Battlefield:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
		
	}
	
	public void calcularPreço(String tipo , int quantidade) {
		
		if(tipo == "Battlefield 5" || tipo == "BF5") {
			
			this.preço = 250 * quantidade;
		}
		
        if(tipo == "Battlefield 1" || tipo == "BF1") {
			
			this.preço = 200 * quantidade;
		}
        
        if(tipo == "Battlefield Hardline") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "Battlefield 4" || tipo == "BF4") {
			
			this.preço = 115 * quantidade;
		}
        
        if(tipo == "Battlefield 3" || tipo == "BF3") {
			
			this.preço = 100 * quantidade;
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
