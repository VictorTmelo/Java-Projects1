
public class Bebida {

	private int tipo;
	private int preço;
	private int quantidade;
	private int quantpedida;
	
	public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 1) Refrigerante.          |");
			preço = 8;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 2) Suco.                  |");
			preço = 5;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 3) Água.                  |");
			preço = 2;
		}
		System.out.println("|Quantidade de bebida pedida: " + getQuantpedida() + "    |");
		System.out.println("|Preço: $" + getPreço() + ",00 reais                |");	
		System.out.println("|----------------------------------|");
	}
	
	public void quantidade() {
		
		this.quantidade = 20;
		
	}
	
	public int getTipo() {
		
		return tipo;
		
	}
	
	public void setTipo(int tipo) {
		
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

	public int getQuantpedida() {
		
		return quantpedida;
		
	}

	public void setQuantpedida(int quantpedida) {
		
		this.quantpedida = quantpedida;
		
	}
}
