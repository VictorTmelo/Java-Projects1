
public class Sobremesa {

	private int tipo;
	private int pre�o;
	
public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 1) Bolo.               |");
			pre�o = 15;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 2) Torta.              |");
			pre�o = 20;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 3) Sorvete.            |");
			pre�o = 10;
		}
		System.out.println("|Pre�o: $" + getPre�o() + ",00 reais               |");
		System.out.println("|----------------------------------|");
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
