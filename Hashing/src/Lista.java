
public class Lista {
	
	private No primeiro;
	private No ultimo;
	
	private char p = 92;
	
	public Lista() {
		
		primeiro = null;
		ultimo = null;
	
	}

	
public void adicionar(int num) {
	
	No novo = new No(num);
	
	if(primeiro == null) {
		
		primeiro = novo;
		ultimo = novo;
		
	}else {
		
		ultimo.setProximo(novo);
		
		ultimo = novo;
		
	}
	
}


 public void imprimir() {
	 
	 No aux = primeiro;
	 
	 while(aux != null) {
		 
		System.out.print(aux.getNumero() + " -> "); 
		aux = aux.getProximo();
		 
	 }
	 
	 System.out.println(p);
	 
 }







}