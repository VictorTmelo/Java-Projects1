
public class No {

    private String nome;
    private int kills;
    private No filho1;
    private No filho2;


    public No(String n, int k) {

        this.nome = n;
        
        this.kills = k;

        filho1 = null;

        filho2 = null;

    }


    public void add(String nome) {

        if (nome.compareTo(this.nome) == 0) {
        	
        	kills++;
        	
        }
        else if (nome.compareTo(this.nome) < 0) {

            if (filho1 == null) {

                filho1 = new No(nome,0);
                filho1.setKills(1);
                

            } else {

                 filho1.add(nome);
                 
            }
            
            

        } else if (nome.compareTo(this.nome) > 0) {

            if (filho2 == null) {

                filho2 = new No(nome,0);
                filho2.setKills(1);

            } else {

                filho2.add(nome);
                
                
            }
            
            
            
        }

        
    }
    
    
    
    public void remover(String nome, No n) {
    	
    	
    	
    	 if (nome.compareTo(this.nome) < 0) {

             if (filho1 != null) {

                filho1.remover(nome, this);
                
                  
             }

             else {

            	 
                 
             }
             
             

       } else if (nome.compareTo(this.nome) > 0) {

             if (filho2 != null) {

               filho2.remover(nome, this);
               
                   
             }

             else {

            	
                      
             }

       } else {

             if (filho1 != null && filho2 != null) {

                   this.nome = filho2.minValue();

                   filho2.remover(this.nome, this);
                   

             } else if (n.filho1 == this) {

                   n.filho1 = (filho1 != null) ? filho1 : filho2;

             } else if (n.filho2 == this) {

                   n.filho2 = (filho1 != null) ? filho1 : filho2;

             }

           
       }
    	 
    	 
    	
    }
    
    
    
    public String minValue() {

        if (filho1 == null)

              return nome;

        else

              return filho1.minValue();

  }
    
    
   
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public int getKills() {
		return kills;
	}


	public void setKills(int kills) {
		this.kills = kills;
	}


	public No getFilho1() {
        return filho1;
    }


    public void setFilho1(No filho1) {
        this.filho1 = filho1;
    }


    public No getFilho2() {
        return filho2;
    }


    public void setFilho2(No filho2) {
        this.filho2 = filho2;
    }


}
