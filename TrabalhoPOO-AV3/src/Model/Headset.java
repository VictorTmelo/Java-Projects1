package Model;

public class Headset {

	private String Marca;
	private String tipo;
	private int pre�o;
	private int quantidade;
	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Headset:");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Pre�o final: " + this.getPre�o());
		

	}
	
	
	public void calcularPre�o(String marca, String tipo, int quantidade) {
		
		if(marca == "HyperX" && tipo == "Cloud Stinger") {
			
			this.pre�o = 250 * quantidade;			
			
		}
		if(marca == "HyperX" && tipo == "Cloud 9") {
			
			this.pre�o = 200 * quantidade;
			
		}
		if(marca == "Razer" && tipo == "Kraken Pro") {
			
			this.pre�o = 250 * quantidade;
		}
		if(marca == "Razer" && tipo == "Kraken") { 
			
			this.pre�o = 200 * quantidade;
			
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


	public int getPre�o() {
		return pre�o;
	}
	

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
