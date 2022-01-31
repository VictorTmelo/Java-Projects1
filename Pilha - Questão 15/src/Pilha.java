public class Pilha {

	private No primeiro;
	
	private No ultimo;
	
	private int tamanho;
	
	public boolean p;
	
	public int r;

	public Pilha() {
		
		primeiro =null;
		
		ultimo = null;
		
		tamanho = 0;
		
		this.p = true;
		
		r = 10;
	}
	
	public void adicionar(){
		
		
		No novo = new No('(');
		
		if(primeiro == null){
			
			primeiro = novo;
			ultimo = novo;
			
		}else{
			
			novo.setProximo(primeiro);
			
			primeiro = novo;
			
		}
		
		tamanho++;
		
	}
	
	
	public void excluir(){
		
		if(primeiro == null) {
			
			r--;
			
		}else {
			
			primeiro = primeiro.getProximo();
			
			tamanho--;
		}
		
		
	
	}
	
	
	public void verifica() {
		
		System.out.println("Verificando expressão: ");
		
		
		if(primeiro == null && tamanho == 0 && this.p == true && r >= 10) {
			
			System.out.println("Expressão correta.");
			
			
		}
		
		if(primeiro != null || this.p == false || tamanho != 0 || r < 10){
			
			System.out.println("Expressão incorreta!");
		}
	
		
	}
	

	
}
