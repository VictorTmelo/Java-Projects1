
public class Stack {

	Pilha pilha = new Pilha();
	Fila fila = new Fila();
	
	No primeiro;
	No ultimo;
	
	
	public void adicionarNaPilha(int x) {
		
		pilha.adicionar(x);
	
	}
	
	
	public void adicionarNaFila(int n) {
		
		fila.adicionar(n);
		
	}
	
	public void compararIguais() {
		
		
		System.out.println("Imprimindo numeros em comum:");
		
		for(int i = 1; i < 6; i++) {
			
			
			for(int j = 1; j < 6; j++) {
				
				
				if(pilha.buscar(i).getNumero() == fila.buscar(j).getNumero()) {
					
					System.out.println(fila.buscar(j).getNumero());
					
				}
				
				
			}
			
			
		}
		
		
	}
	
	
	public void compararDiferentesPilha() {
		
		System.out.println("Imprimindo numeros exclusivos da pilha: ");
		
		for(int i = 1; i < 6; i++) {
			
			boolean x = true;
			
			for(int j = 1; j < 6; j++) {
				
				
				if(pilha.buscar(i).getNumero() == fila.buscar(j).getNumero()) {
					
					x = false;
					
				}
				
				
			}
			
			if(x == true) {
				
				System.out.println(pilha.buscar(i).getNumero());
				
			}
		}
		
		
	}
	
	
	public void compararDiferentesFila() {
		
		System.out.println("Imprimindo numeros exclusivos da fila: ");
		
		for(int i = 1; i < 6; i++) {
			
			boolean x = true;
			
			for(int j = 1; j < 6; j++) {
				
				
				if(pilha.buscar(j).getNumero() == fila.buscar(i).getNumero()) {
					
					x = false;
					
				}
				
				
			}
			
			if(x == true) {
				
				System.out.println(fila.buscar(i).getNumero());
				
				
			}
		}
		
		
	}
	
	
}
