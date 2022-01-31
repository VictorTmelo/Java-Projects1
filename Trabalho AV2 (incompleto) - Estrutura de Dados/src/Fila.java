
public class Fila {

	No primeiro;
	No ultimo;
	
	String c;
	String c2;
	
	int posicoes[];
	
	String bloco;
	String bloco2;
	
	char[]alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[]alfabeto2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public Fila(){
		
		primeiro = null;
		ultimo = null;
		
	}
	

	  public void pegaChave(String chave) {
		
		  posicoes = new int [chave.length()];
		  
		  
		  for(int i = 0; i < chave.length();i++) {
			  
			  for(int a = 0; a < alfabeto.length;a++) {
				  
				  if(chave.charAt(i) == alfabeto[a] || chave.charAt(i) == alfabeto2[a]) {
					  
					  posicoes[i] = a ;
					  
				  }
				  
			  }
		  }
		
	}
	  
	public void adicionarBloco(String bloco1) {
		
		No novo = new No(bloco1);
		
		if(primeiro == null) {
			
			primeiro = novo;
			ultimo = novo;
			
		} else {
			
			ultimo.setProximo(novo);
			
			ultimo = novo;
		}
		
	}
	
	
	public void encriptografar(String nome,String escolha,String chave,int tamanho) {

		int indice = 0;
		
		  
		while(indice < nome.length()) {
			
			
			bloco = nome.substring(indice,Math.min((indice + tamanho),nome.length()));
			
			
			adicionarBloco(bloco);
			
			indice += tamanho;
			

		}
		
		No aux = primeiro;
		
		while(aux != null) {
		
	
			aux.setBloco2(encriptografarR(aux.getBloco1(), escolha, chave, tamanho));
			
			aux = aux.getProximo();
			
		}
		
		
	}
		


		public String encriptografarR(String bloco,String escolha,String chave,int tamanho) {
	
		int pos = 0;

		int aux = 0;
		

	     c2 = "";


		for(int i  = 0; i < bloco.length();i++) {



			for(int a = 0; a < alfabeto.length;a++) {



				if(bloco.charAt(i) == alfabeto[a] || bloco.charAt(i) == alfabeto2[a]) {
					
					


					if(escolha.equals("criptografar")) {



						pos = a + posicoes[aux] ;

						aux++;

						if(aux == chave.length()) {

							aux = 0;
						}

						while(pos > 25) {

							pos = pos - alfabeto.length;
						}

					}

					if(escolha.equals("descriptografar")) {



						pos = a - posicoes[aux] ;

						aux ++;

						if(aux == chave.length()) {

							aux = 0;
						}

						while(pos < 0) {

							pos = alfabeto.length + pos;
						}

					}

					if(bloco.charAt(i) == alfabeto[a]) {

					     c2 += alfabeto[pos];



					} else {

						c2 += alfabeto2[pos];


					}
					

				
				

				}	
			}




			if(bloco.charAt(i) < 'A' || bloco.charAt(i) > 'Z') {

				if(bloco.charAt(i) < 'a' || bloco.charAt(i) > 'z') {


					c2 += bloco.charAt(i);

                     aux++;
                     

						if(aux == chave.length()) {

							aux = 0;
						}
					
				}

			}
			
			
			
			
			

		}
		
		return c2;
		
	
	

	}

	
	public void exibir() {
		
		
		No aux = primeiro;
		
		while(aux != null) {
			
			System.out.print(aux.getBloco2());
			aux = aux.getProximo();
			
			
		}
		
	
		
		
	}
	

	
		
		
	}

