package Model;

public class Fifa implements Jogo {

	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Fifa:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		
		
	}
	
	public void calcularPre�o(String tipo , int quantidade) {
		
		if(tipo == "Fifa19" || tipo == "Fifa 19") {
			
			this.pre�o = 250 * quantidade;
		}
		
        if(tipo == "Fifa18" || tipo == "Fifa 18") {
			
			this.pre�o = 200 * quantidade;
		}
        
        if(tipo == "Fifa17" || tipo == "Fifa 17") {
			
			this.pre�o = 150 * quantidade;
		}
        
        if(tipo == "Fifa16" || tipo == "Fifa 16") {
			
			this.pre�o = 115 * quantidade;
		}
        
        if(tipo == "Fifa15" || tipo == "Fifa 15") {
			
			this.pre�o = 100 * quantidade;
		}
        
        if(tipo == "Fifa14" || tipo == "Fifa 14") {
			
			this.pre�o = 75 * quantidade;
		}
        
        if(tipo == "Fifa13" || tipo == "Fifa 13") {
			
			this.pre�o = 50 * quantidade;
		}
        
        if(tipo == "Fifa12" || tipo == "Fifa 12") {
			
			this.pre�o = 25 * quantidade;
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
