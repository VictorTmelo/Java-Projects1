public class Pilha {
    private No first;
    private No last;
    private int size;

    public Pilha() {
    	
        first = null;
        
        last = null;
        
        size = 0;
    }

    public void push(String letter){
    	
        size++;
        
        No n = new No(letter);
        
        if(first == null){
        	
            first = n;
            last = n;
            
        } else {
        	
            last.setAddress(n);
            last = n;
            
        }
    }

    public void print_all(){
    	
        if(first != null){
        	
            No aux = first;
            
            System.out.print("[");
            
            while(aux.getAddress()!=null){
            	
                System.out.print(aux.getLetter() + ", ");
                
                aux = aux.getAddress();
                
            }
            System.out.print(aux.getLetter() + "]\n");
            
        } else {
        	
            System.out.println("null_list");
            
        }

    }

    public boolean isEmpty(){
    	
        if(first == null){
        	
            return true;
            
        } else {
        	
            return false;
            
        }
    }

    public void pop(){
    	
        if(size > 1){
        	
            size--;
            
            No aux = first;
            
            while(aux.getAddress() != last){
            	
                aux = aux.getAddress();
            }
            
            aux.setAddress(null);
            
            last = aux;
            
        } else {
        	
            first = null;
            
        }
    }

    public No top(){
    	
        No aux = first;
        
        while(aux.getAddress() != null){
        	
            aux = aux.getAddress();
            
           
        }
        
        return aux;
    }


}
