
public class Lanche {

	private int tipo;
	private int preço;
	
public void status() {
	
		if(tipo == 1){
			System.out.println("|-----------------------------------|");
			System.out.println("|Lanche: 1) Burger.                 |");
			
			preço = 20;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("Lanche: 2) Fritas.                 |");
			preço = 10;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("Lanche: 3) Pastel.                 |");
			preço = 5;
		}	
		System.out.println("|Preço: $" + getPreço() + ",00 reais                |");
		System.out.println("|-----------------------------------|");
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
