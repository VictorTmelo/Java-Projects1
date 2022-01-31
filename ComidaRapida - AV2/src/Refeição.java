
public class Refeição {

	private int tipo;
	private int preço;
	
public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refeição: 1) Combo - Burger + Fritas + Refrigerante.|");
			preço = 30;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refeição: 2) Pizza Grande - 12 fatias.              |");
			preço = 50;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refeição: 3) Combinado de sushis - 20 unidades.     |");
			preço = 40;
		}
		System.out.println("|Preço: $" + getPreço() + ",00 reais                                 |");
		System.out.println("|----------------------------------------------------|");
		
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
}
