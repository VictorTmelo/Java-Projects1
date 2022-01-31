
public class Pilha {

	private Fila f1;
	private Fila f2;
	
	public Pilha() {
		
		f1 = new Fila();
		f2 = new Fila();
		
	}
	
	public void adicionar(int n, int x) {
		
		f1.adicionar(n);
		f2.adicionar(x);
	
	}
	
	public void excluir() {
		
		f1.excluir();
		f2.excluir();

	}
	
	public void exibir() {
		
		System.out.println("Pilha: ");
		System.out.println();
		System.out.print("Fundo ");
		f1.exibir(); 
		System.out.print(" Topo");
		System.out.println();
		System.out.print("Fundo ");
		f2.exibir();
		System.out.println(" Topo");
	}
	
}
