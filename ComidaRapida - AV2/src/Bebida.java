
public class Bebida {

	private int tipo;
	private int pre�o;
	private int quantidade;
	private int quantpedida;
	
	public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 1) Refrigerante.          |");
			pre�o = 8;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 2) Suco.                  |");
			pre�o = 5;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("|Bebida: 3) �gua.                  |");
			pre�o = 2;
		}
		System.out.println("|Quantidade de bebida pedida: " + getQuantpedida() + "    |");
		System.out.println("|Pre�o: $" + getPre�o() + ",00 reais                |");	
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
	
	public int getPre�o() {
		
		return pre�o;
		
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
