import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		String teste;
		
		String tam;
		
		//System.out.println("Quantos casos de teste você deseja ? ");
		teste = in.readLine();
		
		int t = Integer.parseInt(teste);
		
		Hash[] hashing = new Hash[t];
		
		
		for(int i = 0; i < t; i++) {
			
			//System.out.println("Qual o tamanho do vetor e a quantidade de elementos ? ");
			tam = in.readLine();	
			
			String[] tamQtd = tam.split(" ");
			
			int tamanho = Integer.parseInt(tamQtd[0]);
			
			int quant = Integer.parseInt(tamQtd[1]);
			
			hashing[i] = new Hash(tamanho);
			
			String numeros;
			
			//System.out.println("Digite os numeros que deseja adicionar: ");
			numeros = in.readLine();
			
			String all[] = new String[quant];
			
			all = numeros.split(" ");
			
			for(int y = 0; y < quant; y++) {
				
				int x = Integer.parseInt(all[y]);
				hashing[i].adicionar(x);
				
			}
			
			
			
			
		}
		
		for(int j = 0; j < t; j++) {
			
			hashing[j].imprimir();
			
			if(j < t -1) {
				
			System.out.println();
			
			}
			
		}
		

	}

}
