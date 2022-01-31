package Model;

public class GrandTheftAuto implements Jogo {

	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Grand Theft Auto:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
		
	}
	
	public void calcularPreço(String tipo , int quantidade) {
		
		if(tipo == "GTA 5" || tipo == "Gta 5") {
			
			this.preço = 250 * quantidade;
		}
		
        if(tipo == "GTA 4" || tipo == "Gta 4") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "GTA Vice City" || tipo == "Gta Vice City") {
			
			this.preço = 50 * quantidade;
		}
        
        if(tipo == "GTA Liberty City" || tipo == "Gta Liberty City") {
			
			this.preço = 50 * quantidade;
		}
        
        if(tipo == "GTA San Andreas" || tipo == "Gta San Andreas") {
			
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
