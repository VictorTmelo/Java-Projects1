package Model;

public class AssassinsCreed implements Jogo {
	
	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Assassin's Creed: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
		
	}
	
	public void calcularPreço(String tipo , int quantidade) {
		
		if(tipo == "Odyssey") {
			
			this.preço = 250 * quantidade;
		}
		
        if(tipo == "Origins") {
			
			this.preço = 200 * quantidade;
		}
        
        if(tipo == "Syndicate") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "Unity") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "Black Flag") {
			
			this.preço = 125 * quantidade;
		}
        
        if(tipo == "3" || tipo == "Assassin's Creed 3") {
			
			this.preço = 100 * quantidade;
		}
        
        if(tipo == "Revelations") {
			
			this.preço = 100 * quantidade;
		}
        
        if(tipo == "Brotherhood") {
			
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
