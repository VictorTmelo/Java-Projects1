public class Pedido {

	private boolean situa��o;
	
	public void status() {
		
		setSitua��o(true);
		
		if(situa��o == true) {
			System.out.println("|Pedido atendido com sucesso.            |");
			System.out.println("|----------------------------------------|");
		}
		
	}
	
	public Pedido() {
		
		this.setSitua��o(false);
		
	}
	
	public boolean setSitua��o() {
		
		return situa��o;
		
	}
	public void setSitua��o(boolean situa��o) {
		
		this.situa��o = situa��o;
		
	}	
}