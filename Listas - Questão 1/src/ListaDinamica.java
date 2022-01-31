
public class ListaDinamica {

	private No primeiro;
	private No ultimo;
	
	public ListaDinamica() {
		
		primeiro = null;
		ultimo = null;
		
	}
	
	
	public void adicionar(String c, double p, int q) {
		
		No novo = new No(c, p, q);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
			
		}else {
			
			ultimo.setProx(novo);
			ultimo = novo;
			
		}
		
		System.out.println(novo.getCodigo() + " - " + novo.getPreco() + " - " + novo.getQuant());
		
	}

	public void descontar(double sp) {
		
		No aux = primeiro;
		
		while(aux != null) {
			
			aux.setPreco(aux.getPreco() - (aux.getPreco() * (sp/100)));
			System.out.println("Imprimindo dados atualizados do produto: ");
			System.out.println(" ");
			System.out.println("------------------------------------------");
			System.out.println("Codigo do produto: " + aux.getCodigo());
			System.out.println("Preço do produto : " + aux.getPreco());
			System.out.println("Quantidade do produto: " + aux.getQuant());
			System.out.println("------------------------------------------");
			aux = aux.getProx();
			
			
		}
		
		
		
	}
	
	
	public void remover(int pos) {
		
		No ant = null;
		
		No aux = primeiro;
		
		int i = 1;
		
		while(i < pos ) {
			
			ant = aux;
			aux = aux.getProx();
			
			i++;
			
		}
		
		ant.setProx(aux.getProx());
		aux.setProx(null);
	}
	
	
	
}
