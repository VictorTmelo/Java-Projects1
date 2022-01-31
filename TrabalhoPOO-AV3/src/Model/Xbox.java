package Model;

public class Xbox extends Console {

	private String Tipo;

	
	public void status() {
		
		System.out.println("Detalhes da compra do seu Xbox:");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Preço final: " + this.getPreço());
		
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}
