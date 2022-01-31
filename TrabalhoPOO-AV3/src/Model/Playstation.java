package Model;

public class Playstation extends Console {

	private String tipo;
	private boolean pro;
	
	
	public void status() {
		
		if(this.pro == true) {
			
			System.out.println("Detalhes da compra do seu Playstation:");
			System.out.println("Tipo: " + this.getTipo());
			System.out.println("Cor: " + this.getCor());
			System.out.println("PS4 pro: " + this.getPro());
			System.out.println("Quantidade: " + this.getQuantidade());
			System.out.println("Preço final: " + this.getPreço());
			
		}else {
			
			
			System.out.println("Detalhes da compra do seu Playstation:");
			System.out.println("Tipo: " + this.getTipo());
			System.out.println("Cor: " + this.getCor());
			System.out.println("Quantidade: " + this.getQuantidade());
			System.out.println("Preço final: " + this.getPreço());
		}
		
			
			
		}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean getPro() {
		return pro;
	}


	public void setPro(boolean pro) {
		this.pro = pro;
	}
		

}
