package Model;

public class Headset {

	private String Marca;
	private String tipo;
	private int preço;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Headset:");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		

	}
	
	
	public void calcularPreço(String marca, String tipo, int quantidade) {
		
		if(marca == "HyperX" && tipo == "Cloud Stinger") {
			
			this.preço = 250 * quantidade;			
			
		}
		if(marca == "HyperX" && tipo == "Cloud 9") {
			
			this.preço = 200 * quantidade;
			
		}
		if(marca == "Razer" && tipo == "Kraken Pro") {
			
			this.preço = 250 * quantidade;
		}
		if(marca == "Razer" && tipo == "Kraken") { 
			
			this.preço = 200 * quantidade;
			
		}
	
		
		
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
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
	

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
