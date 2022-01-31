
public class ListaDinamica {

	private No primeiro;
	private No ultimo;
	
	
	public ListaDinamica() {
		
		primeiro = null;
		ultimo = null;
		
	}
	
	public void adicionar(String tipo, double potencia, int quantidade, double tempo){
		
		No novo = new No(tipo, potencia, quantidade, tempo);
		
		if(primeiro == null){
			
			primeiro = novo;
			
			ultimo = novo;
			
		}else{
			
			ultimo.setProximo(novo);
			
			ultimo = novo;
			
		}
		
		
	}
	
	public void consumoMensal(){
		
		No aux = primeiro;
		
		while(aux != null){
			
			System.out.println("Consumo mensal do " + aux.getTipo() + " :");
			System.out.println(((aux.getPotencia() * aux.getQuantidade()) * aux.getTempo() / 1000) + " Kwh");
			System.out.println(" ");
			aux = aux.getProximo();
		}
		
		
		
	}
	
	public void custoMensal(){
		
		No aux = primeiro;
		
		while(aux != null){
			
			System.out.println("Custo mensal do " + aux.getTipo() + " :");
			System.out.println(((aux.getPotencia() * aux.getQuantidade()) * aux.getTempo() / 1000) * 0.77259 + " R$");
			System.out.println(" ");
			aux = aux.getProximo();
			
		}
	}
	
	public void consumoTotalMensal(){
		
		No aux = primeiro;
		
		double x = 0;
		
		while(aux != null){
			
			x = ((aux.getPotencia() * aux.getQuantidade()) * aux.getTempo() / 1000) + x;
			
			aux = aux.getProximo();
			
			
		}
		
		System.out.println("Consumo total dos eletrodomesticos: " + x + " Kwh");
		System.out.println(" ");
	}
	
	public void custoTotalMensal(){
		
		No aux = primeiro;
		
		double x = 0;
		
		while(aux != null){
			
			x = (((aux.getPotencia() * aux.getQuantidade()) * aux.getTempo()) / 1000) * 0.77259 + x;
			
			aux = aux.getProximo();
			
		}
		
		System.out.println("Custo total dos eletrodomesticos: " + x + " R$");
		System.out.println(" ");
		
	}
	
	
}
