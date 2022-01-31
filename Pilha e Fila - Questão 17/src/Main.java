
public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.adicionar(9, 9);
		pilha.adicionar(5, 5);
		pilha.adicionar(6, 6);
		pilha.adicionar(2, 2);
		pilha.adicionar(7, 7);
		
		pilha.excluir();
		
		pilha.exibir();
		
		
	}

}
