
public class Refei��o {

	private int tipo;
	private int pre�o;
	
public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refei��o: 1) Combo - Burger + Fritas + Refrigerante.|");
			pre�o = 30;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refei��o: 2) Pizza Grande - 12 fatias.              |");
			pre�o = 50;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Refei��o: 3) Combinado de sushis - 20 unidades.     |");
			pre�o = 40;
		}
		System.out.println("|Pre�o: $" + getPre�o() + ",00 reais                                 |");
		System.out.println("|----------------------------------------------------|");
		
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
