
public class Sobremesa {

	private int tipo;
	private int preço;
	
public void status() {
		
		if(tipo == 1){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 1) Bolo.               |");
			preço = 15;
		}
		if(tipo == 2){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 2) Torta.              |");
			preço = 20;
		}
		if(tipo == 3){
			System.out.println("|----------------------------------|");
			System.out.println("|Sobremesa: 3) Sorvete.            |");
			preço = 10;
		}
		System.out.println("|Preço: $" + getPreço() + ",00 reais               |");
		System.out.println("|----------------------------------|");
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
