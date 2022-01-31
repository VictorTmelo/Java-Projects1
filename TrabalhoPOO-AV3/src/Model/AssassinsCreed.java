package Model;

public class AssassinsCreed implements Jogo {
	
	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Assassin's Creed: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		
		
	}
	
	public void calcularPre�o(String tipo , int quantidade) {
		
		if(tipo == "Odyssey") {
			
			this.pre�o = 250 * quantidade;
		}
		
        if(tipo == "Origins") {
			
			this.pre�o = 200 * quantidade;
		}
        
        if(tipo == "Syndicate") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "Unity") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "Black Flag") {
			
			this.pre�o = 125 * quantidade;
		}
        
        if(tipo == "3" || tipo == "Assassin's Creed 3") {
			
			this.pre�o = 100 * quantidade;
		}
        
        if(tipo == "Revelations") {
			
			this.pre�o = 100 * quantidade;
		}
        
        if(tipo == "Brotherhood") {
			
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
