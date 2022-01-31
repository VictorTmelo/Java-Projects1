package Model;

public class Fifa implements Jogo {

	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Fifa:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
		
	}
	
	public void calcularPreço(String tipo , int quantidade) {
		
		if(tipo == "Fifa19" || tipo == "Fifa 19") {
			
			this.preço = 250 * quantidade;
		}
		
        if(tipo == "Fifa18" || tipo == "Fifa 18") {
			
			this.preço = 200 * quantidade;
		}
        
        if(tipo == "Fifa17" || tipo == "Fifa 17") {
			
			this.preço = 150 * quantidade;
		}
        
        if(tipo == "Fifa16" || tipo == "Fifa 16") {
			
			this.preço = 115 * quantidade;
		}
        
        if(tipo == "Fifa15" || tipo == "Fifa 15") {
			
			this.preço = 100 * quantidade;
		}
        
        if(tipo == "Fifa14" || tipo == "Fifa 14") {
			
			this.preço = 75 * quantidade;
		}
        
        if(tipo == "Fifa13" || tipo == "Fifa 13") {
			
			this.preço = 50 * quantidade;
		}
        
        if(tipo == "Fifa12" || tipo == "Fifa 12") {
			
			this.preço = 25 * quantidade;
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
