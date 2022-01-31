
public class ListaDinamica {

	private No primeiro;
	private No ultimo;
	
	
	public ListaDinamica() {
		
		primeiro = null;
		ultimo = null;
		
	}
	
	
	public void adicionar(String nome, double nota) {
		
		No novo = new No(nome, nota);
	
		if(primeiro == null) {
			
			primeiro = novo;
			
			ultimo = novo;
			
		}else {
			
			
			ultimo.setProximo(novo);
			
			novo.setAnterior(ultimo);
			
			ultimo = novo;
			
			
		}
		
	}
	
	public void imprimir() {
		
		No aux = primeiro;
		
		boolean verdade = false;
		
		while(aux != null) {
			
		
			if(aux.getNota() >= 70) {
				
				System.out.println("Aluno aprovado: " + aux.getNome());
				
				verdade = true;
			
			}
	
			aux = aux.getProximo();
			
		}
		
		if(verdade == false) {
			
			System.out.println("Ninguem foi aprovado! "); 
			
		}
		
		
	}
	
	
	
}
