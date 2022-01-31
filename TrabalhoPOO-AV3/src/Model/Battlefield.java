package Model;

public class Battlefield implements Jogo {
	
	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Battlefield:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		
		
	}
	
	public void calcularPre�o(String tipo , int quantidade) {
		
		if(tipo == "Battlefield 5" || tipo == "BF5") {
			
			this.pre�o = 250 * quantidade;
		}
		
        if(tipo == "Battlefield 1" || tipo == "BF1") {
			
			this.pre�o = 200 * quantidade;
		}
        
        if(tipo == "Battlefield Hardline") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "Battlefield 4" || tipo == "BF4") {
			
			this.pre�o = 115 * quantidade;
		}
        
        if(tipo == "Battlefield 3" || tipo == "BF3") {
			
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
