
public class SetOfStacks {

	private Pilha pilha;
	
	public SetOfStacks() {
		
		pilha = new Pilha();
		
	}

	public void adicionar(int n) {
		
		pilha.adicionar(n);
		
		if(pilha.getTamanho() >= 10) {
			
			this.exibir();
			
			System.out.print("  ");
			
			pilha = null;
			
			pilha = new Pilha();
			
			pilha.setTamanho(0);
			
		}
		
		
	}
	
	public void excluir() {
		
		pilha.excluir();
		
	}
	
	public void exibir() {
		
		pilha.exibir();
		
	}
	
}
