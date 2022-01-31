
public class ListaDinamica {

	private No primeiro;
	private No ultimo;
	
	public ListaDinamica() {
		
		primeiro = null;
		ultimo = null;
		
	}
	
	
	public void adicionar(String c, double p, int q) {
	
		Produto prod = new Produto(c,p,q);
		
		No novo = new No(prod);
	
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
			
		}else {
			
			ultimo.setProx(novo);
			ultimo = novo;
			
		}
		
System.out.println(prod.getCodigo() + " - " + prod.getPreco() + " - " + prod.getQuant());
		
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
