package Model;

public class GrandTheftAuto implements Jogo {

	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Grand Theft Auto:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		
		
	}
	
	public void calcularPre�o(String tipo , int quantidade) {
		
		if(tipo == "GTA 5" || tipo == "Gta 5") {
			
			this.pre�o = 250 * quantidade;
		}
		
        if(tipo == "GTA 4" || tipo == "Gta 4") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "GTA Vice City" || tipo == "Gta Vice City") {
			
			this.pre�o = 50 * quantidade;
		}
        
        if(tipo == "GTA Liberty City" || tipo == "Gta Liberty City") {
			
			this.pre�o = 50 * quantidade;
		}
        
        if(tipo == "GTA San Andreas" || tipo == "Gta San Andreas") {
			
			this.pre�o = 100 * quantidade;
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
