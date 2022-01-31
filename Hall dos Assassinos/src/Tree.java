
public class Tree {

    private No raiz;
    private int contador;

    
	public Tree() {

        raiz = null;

        contador = 0;

    }



    public void adicionar(String nome) {

        if(raiz == null) {

           raiz = new No(nome,1);

        }else {

            raiz.add(nome);


        }



    }



    public void preOrdem(No n) {

        System.out.print(n.getNome() + " " + n.getKills());

        if(n.getFilho1() != null){

           preOrdem(n.getFilho1());

        }

       if(n.getFilho2() != null){

           preOrdem(n.getFilho2());

       }


    }
    
    
    public void emOrdem(No n) {

    	if(raiz != null) {
  
        if(n.getFilho1() != null){

           emOrdem(n.getFilho1());
          
        }
        
        System.out.println(n.getNome() + " " + n.getKills());

       if(n.getFilho2() != null){

           emOrdem(n.getFilho2());

       }
       
    	}
       
    }


    public void posOrdem(No n) {


        if(n.getFilho1() != null){

           posOrdem(n.getFilho1());

        }

       if(n.getFilho2() != null){

           posOrdem(n.getFilho2());

       }

       System.out.print(n.getNome() + " " + n.getKills());

    }


    public void remover(String nome) {

    	 if (raiz == null) {
    		 
    		 
        }else {

             if (raiz.getNome() == nome) {

                   No aux = new No("", 0);

                   aux.setFilho1(raiz);

                   raiz.remover(nome, aux);

                   raiz = aux.getFilho1();

             } else {

                   raiz.remover(nome, null);

             }

       }
    	 
    
    }
    
    
    
    
    public No getRaiz() {
		return raiz;
	}



	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}



	public int getContador() {
		return contador;
	}



	public void setContador(int contador) {
		this.contador = contador;
	}

}
