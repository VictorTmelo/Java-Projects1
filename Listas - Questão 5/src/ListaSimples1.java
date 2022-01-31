
public class ListaSimples1 {

	NoSimples primeiro;
	NoSimples ultimo;
	
	
	public ListaSimples1(){
		
		primeiro = null;
		ultimo = null;
		
	}
	
	public void adicionar(int numero) {
		
		NoSimples novo = new NoSimples(numero);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		}  else {
			
			ultimo.setProximo(novo);
			ultimo = novo;
		}
	}
	
	public void exibir() {
		
		NoSimples aux = primeiro;
		
		while( aux != null) {
			
			System.out.print(aux.getNumero() + " ");
			aux = aux.getProximo();
		}
	}
}
