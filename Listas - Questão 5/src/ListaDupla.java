
public class ListaDupla {

	NoDuplo primeiro;
	NoDuplo ultimo;
	
	 public ListaDupla() {
		 
		 primeiro = null;
		 ultimo = null;
		 
	 }
	 
	 public void adicionar(int numero) {
		 
		 NoDuplo novo = new NoDuplo(numero);
		 
		 if(primeiro == null) {
			 
			 primeiro = novo;
			 ultimo = novo;
			 
		 } else {
			 
			 NoDuplo aux = primeiro;
			 
			 while(aux != null && numero > aux.getNumero()) {
				 
				 aux = aux.getProximo();
				 
			 }
			 
			 if(primeiro == aux) {
				 
				 novo.setProximo(primeiro);
				 primeiro.setAnterior(novo);
				 primeiro = novo;
				 
			 }  else if (aux == null) {
				 
				 ultimo.setProximo(novo);
				 novo.setAnterior(ultimo);
				 ultimo = novo;
				 
			 }  else {
				 
				 novo.setProximo(aux);
				 aux.getAnterior().setProximo(novo);
				 novo.setAnterior(aux.getAnterior());
				 aux.setAnterior(novo);
			 }
		 }
	 }
	 
	 public void exibirCrescente() {
		 
		 NoDuplo aux = primeiro;
		 
		 while(aux != null) {
			 
			 System.out.print(aux.getNumero() + " ");
			 aux = aux.getProximo();
		 }
	 }
	 
	 public void exibirDecrescente() {
		 
		 NoDuplo aux = ultimo;
		 
		 while(aux != null) {
			 
			 System.out.print(aux.getNumero() + " ");
			 aux = aux.getAnterior();
		 }
	 }
}
