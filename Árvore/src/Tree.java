
public class Tree {

    private No raiz;
    
    
	public Tree() {

        raiz = null;

    }
	
	/*
	public void adicionar(No n,String nome) {
		
		 No novo = new No(nome);
		
		if(nome.compareTo(n.getNome() ) == 0) {
			
			System.out.println("Valor repetido");
			
		} else if(nome.compareTo(n.getNome()) > 0) {
			
			if(n.getDireito() == null) {
				
				n.setDireito(novo);
				
			} else {
				
				adicionar(n.getDireito(), nome);
			}
			
		} else if(nome.compareTo(n.getNome()) < 0) {
			
			if(n.getEsquerdo() == null) {
				
				n.setEsquerdo(novo);
				
			} else {
				
				adicionar(n.getEsquerdo(),nome);
			}
		}
	}
	public void adicionar(String nome) {
		
		if(raiz == null) {
			
		    raiz = new No(nome);
			
		} else {
			
			adicionar(raiz,nome);
		}
	}
*/


    public void adicionar(int n) {

        if(raiz == null) {

           raiz = new No(n);

        }else {

            raiz.add(n);


        }



    }



    public void preOrdem(No n) {

        System.out.print(n.getNum() + " ");

        if(n.getFilho1() != null){

           preOrdem(n.getFilho1());

        }

       if(n.getFilho2() != null){

           preOrdem(n.getFilho2());

       }


    }
    
    
    public void emOrdem(No n) {

        
        if(n.getFilho1() != null){

           emOrdem(n.getFilho1());
          
        }
        
        System.out.print(n.getNum() + " ");

       if(n.getFilho2() != null){

           emOrdem(n.getFilho2());

       }


    }
    
    
    public void posOrdem(No n) {


        if(n.getFilho1() != null){

           posOrdem(n.getFilho1());

        }

       if(n.getFilho2() != null){

           posOrdem(n.getFilho2());

       }

       System.out.print(n.getNum() + " ");

    }


    public void remover(int num) {

   	 if (raiz == null) {
   		 
   		 
       }else {

            if (raiz.getNum() == num) {

                  No aux = new No(0);

                  aux.setFilho1(raiz);

                  raiz.remover(num, aux);

                  raiz = aux.getFilho1();

            } else {

                  raiz.remover(num, null);

            }

      }
   	 
   
   }
    
    
    
    public No getRaiz() {
		return raiz;
	}



	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}


}
