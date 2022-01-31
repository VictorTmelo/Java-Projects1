public class Pedido {

	private boolean situação;
	
	public void status() {
		
		setSituação(true);
		
		if(situação == true) {
			System.out.println("|Pedido atendido com sucesso.            |");
			System.out.println("|----------------------------------------|");
		}
		
	}
	
	public Pedido() {
		
		this.setSituação(false);
		
	}
	
	public boolean setSituação() {
		
		return situação;
		
	}
	public void setSituação(boolean situação) {
		
		this.situação = situação;
		
	}	
}