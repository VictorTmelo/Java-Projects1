
public class ListaDinamica {

	private No primeiro;
	private No ultimo;
	private int tamanho;
	
	
	public ListaDinamica() {
		
		primeiro = null;
		ultimo = null;
		this.tamanho = 0;
		
	}
	
	public void adicionar(String nome, double salario) {
		
		No novo = new No(nome,salario);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		}else {
			
			No anterior = null;
			
			No aux = primeiro;
			
			while(aux != null && salario < aux.getSalario()) {
				
				anterior = aux;
				
				aux = aux.getProximo();
			}
			
			if(aux == primeiro) {
				
				novo.setProximo(primeiro);
			
				primeiro = novo;
				
			}else if(aux == null) {
				
				ultimo.setProximo(novo);
				
				ultimo = novo;
				
			}else {
				
				anterior.setProximo(novo);
				
				novo.setProximo(aux);
				
			}
		}
		
	}
	
	
	
	public void imprimir() {
		
		No aux = primeiro;
		
		while(aux != null) {
			
			System.out.println("Funcionario: " + aux.getNome() + " | Salario: " + aux.getSalario());
			
			aux = aux.getProximo();
		}
		
	
	}
	

	
	public void mediaSalario() {
		
		No aux = primeiro;
			
		int i = 0;
		
		double x = 0;
		
			while(aux != null) {
				
				x = aux.getSalario() + x;
			
				i++;
				
				aux = aux.getProximo();
				
			}
				
			System.out.println("Media dos salarios: " + x/i);
		}
		
	public void igualSalario() {
		
		No aux = primeiro;
		
		No aux1 = primeiro;
		
		double maior = 0;
		
		
		while(aux != null) {
			
			if(maior < aux.getSalario()) {
				
				maior = aux.getSalario();
				
			}
			
			aux = aux.getProximo();
		
		}
		
		
		while(aux1 != null) {
			
			if(maior == aux1.getSalario()) {
				
				System.out.println("Nome do funcionario: " + aux1.getNome());
				System.out.println("Salario dos funcionarios: " + aux1.getSalario());
				
			}
			
			aux1 = aux1.getProximo();
		
		}
		
		
		
		
		
	}
	
	
	
	
	public No getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}


	public No getUltimo() {
		return ultimo;
	}


	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}



