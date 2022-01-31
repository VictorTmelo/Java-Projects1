import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		Tree arvore = new Tree();
		
		ArrayList<String>mortos = new ArrayList<String>();
		
		while(true) {
		
			String nomes = in.readLine();
			
			if(nomes.equals("")) {
				
				break;
			}
			
			String[] frase = nomes.split(" ");
			
			String nome = frase[0];
			
			arvore.adicionar(nome);
			
			mortos.add(frase[1]);
				
	
		}
		
        for(int i = 0; i < mortos.size(); i++) {
        	
        	arvore.remover(mortos.get(i));
        
        }
        
        System.out.println("HALL OF MURDERERS");
		
        arvore.emOrdem(arvore.getRaiz());

    }

}
