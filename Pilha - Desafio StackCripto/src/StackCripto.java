public class StackCripto {
	
    private No first;
    private No last;
    private int size;
    private int stack_ammount;
    

    public StackCripto(int ammount) {
    	
        Pilha p1 = new Pilha();  
        
        Pilha p2 = new Pilha();
        
        first = new No(p1, 1); last = new No(p2, 2);
        
        first.setAddress(last);
        
        size = 2; stack_ammount = ammount;
        
        if(stack_ammount > 2){
        	
            while(size <= stack_ammount - 1){
            	
                size++;
                
                Pilha new_stack = new Pilha();
                
                No n = new No(); n.setElement(new_stack); n.setPosition(size);
                
                last.setAddress(n);
                
                last = n;
            }
        }
    }

    public void slice_and_crypto(String input_word){
    	
        String aux;
        
        int current_index;
        
        for(int i = 0; i < input_word.length(); i++){
        	
            aux = String.valueOf(input_word.charAt(i));
            
            current_index = i%stack_ammount;
            
            get_by_index(current_index).push(aux);
            
        }
    }

    public void print_stacks(){
    	
        No aux = first;
        
        while(aux!=null){
        	
            aux.print_all();
            
            aux = aux.getAddress();
            
        }
        
    }

    public String decrypto(){
    	
        String final_result = "";
        
        No aux;
        
        while(!last.isEmpty()){
        	
            for(int i = 0; i <= stack_ammount - 1; i++){
            	
                aux = get_by_index(i);
                
                final_result += aux.top().getLetter();
                
                aux.pop();
                
            }
        }
        
        return final_result;
     
    }

    public void insert_crypto(String input, int index){
    	
        No aux = get_by_index(2);
        
        aux.push(input);
        
    }

    public No get_by_index(int index){
    	
        No aux = first;
        
        int counter = 0;
        
        while(counter != index){
        	
            counter++;
            
            aux = aux.getAddress();
            
        }
        
        return aux;
    }
}
