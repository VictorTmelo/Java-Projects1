
public class Lanche {

	private int tipo;
	private int pre�o;
	
public void status() {
	
		if(tipo == 1){
			System.out.println("|-----------------------------------|");
			System.out.println("|Lanche: 1) Burger.                 |");
			
			pre�o = 20;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("Lanche: 2) Fritas.                 |");
			pre�o = 10;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("Lanche: 3) Pastel.                 |");
			pre�o = 5;
		}	
		System.out.println("|Pre�o: $" + getPre�o() + ",00 reais                |");
		System.out.println("|-----------------------------------|");
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
}
