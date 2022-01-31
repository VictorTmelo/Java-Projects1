
public class Lista {

	No primeiro;
	No ultimo;
	
	
	public Lista(){
		
		primeiro = null;
		ultimo = null;
		
	}
	
	
	public void adicionar(String nome,int chave,String escolha) {

		char letra = ' ';
		char cripto = ' ';

		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		char[] alfabeto2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		int pos = 0;
		
        char v[] = nome.toCharArray();
		
		char[] criptos = new char[v.length];
		
		for(int i  = 0; i < v.length;i++) {
			
			
			for(int a = 0; a < alfabeto.length;a++) {
				
				
				
			if(v[i] == alfabeto[a] || v[i] == alfabeto2[a]) {
				
				if(escolha.equals("criptografar")) {
				
				pos = a + chave;
				
				  while(pos > 25) {
					
					pos = pos - alfabeto.length;
				  }
				  
				}
				
				if(escolha.equals("descriptografar")) {
					
					pos = a - chave;
					
					while(pos < 0) {
						
						pos = alfabeto.length + pos;
					}
					
				}
				
				if(v[i] == alfabeto[a]) {
				
				criptos[i]= alfabeto[pos];
				
				cripto = criptos[i];
				
				
				} else {
					
					criptos[i] = alfabeto2[pos];
					
					cripto = criptos[i];
					
				}
				
				
			}
			
			
		}
		
			letra = v[i];
			
			if(v[i] == ' ') {
				
				letra = v[i];
				cripto = v[i];
				
			}
			
			No novo = new No(letra,cripto);
			
			if(primeiro == null) {
				
				primeiro = novo;
				ultimo = novo;
				
			}  else  {
				
				ultimo.setProximo(novo);
				novo.setAnterior(ultimo);
				ultimo = novo;
			}
			
			
		}
		
		

}
	

	public void exibir() {
		
		
		No aux = primeiro;
		
		while(aux != null) {
			
			System.out.print(aux.getCripto());
			aux = aux.getProximo();
			
			
		}
		
		
	}
	
	


}

