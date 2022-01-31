
public class No {

    private int num;
    private No filho1;
    private No filho2;


    public No(int n) {

        this.num = n;

        filho1 = null;

        filho2 = null;

    }


    public void add(int num) {

        if (num == this.num) {

        }
        else if (num < this.num) {

            if (filho1 == null) {

                filho1 = new No(num);

            } else

                 filho1.add(num);

        } else if (num > this.num) {

            if (filho2 == null) {

                filho2 = new No(num);

            } else

                filho2.add(num);

        }



    }
    
    
    
    public void remover(int num, No n) {
    	
    	
   	 if (num < this.num) {

            if (filho1 != null) {

               filho1.remover(num, this);
                 
            }

            else {

                
            }

      } else if (num > this.num) {

            if (filho2 != null) {

              filho2.remover(num, this);
                  
            }

            else {

                     
            }

      } else {

            if (filho1 != null && filho2 != null) {

                  this.num = filho2.minValue();

                  filho2.remover(this.num, this);

            } else if (n.filho1 == this) {

                  n.filho1 = (filho1 != null) ? filho1 : filho2;

            } else if (n.filho2 == this) {

                  n.filho2 = (filho1 != null) ? filho1 : filho2;

            }

          
      }
   	
   }
   
   
   public int minValue() {

       if (filho1 == null)

             return num;

       else

             return filho1.minValue();
       

 }
   
   
   
   public boolean buscar(int num) {
	   
   	
   	if(num == this.getNum()) {
   		
   		return true;
   		
   	}else if(num < this.getNum()) {
   		
   		if(filho1 == null) {
   			
   			return false;
   			
   		} else {
   			
   			return buscar(num);
   			
   		}
   		
   	} else if(num > this.getNum()) {
   		
   		if(filho2 == null) {
   			
   			return false;
   			
   		} else {
   			
   			return buscar(num);
   		}
   	}
   	
   	return false;
   	
   }
    
 

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
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
