public class Main {
    public static void main(String[] args) {
    	
        Pilha teste = new Pilha();
        
        teste.push("B"); teste.push("A"); teste.push("D");
        
        teste.print_all();
        
        StackCripto super_stack = new StackCripto(3);
        
        String input_word = "Esta frase esta criptografada com StackCripto";
        
        super_stack.slice_and_crypto(input_word);
        
        System.out.println(input_word + "\n");
        
        super_stack.print_stacks();
        
        String notification = super_stack.decrypto();
        
        System.out.println("");
        
        System.out.println(notification);
    }
}
