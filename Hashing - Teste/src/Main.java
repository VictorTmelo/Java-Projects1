import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    
    public static class No {

	private int numero;
	private No proximo;
	
	
	public No(int n) {
	
		this.numero = n;
		
		proximo = null;
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public No getProximo() {
		return proximo;
	}


	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}
    																																	
    
public static class Lista {
	
	private No primeiro;
	private No ultimo;
	
	private char p = 92;
	
	public Lista() {
		
		primeiro = null;
		ultimo = null;
	
	}

	
	
public void adicionar(int num) {
	
	No novo = new No(num);
	
	if(primeiro == null) {
		
		primeiro = novo;
		ultimo = novo;
		
	}else {
		
		ultimo.setProximo(novo);
		
		ultimo = novo;
		
	}
	
}


 public void imprimir() {
	 
	 No aux = primeiro;
	 
	 while(aux != null) {
		 
		System.out.print(aux.getNumero() + " -> "); 
		aux = aux.getProximo();
		 
	 }
	 
	 System.out.println(p);
	 
 }



}    



public static class Hash {
	
	public Lista[]hash;
	private int tamanho;
	private int quantidade;
	
	
	public Hash(int tam, int qtd) {
		
		this.tamanho = tam;
		
		this.quantidade = qtd;
		
		hash = new Lista[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			
			hash[i] = new Lista();
			
		}
		
	}
	
	
	public void adicionar(int num) {
		
		int n = num % tamanho;
		
		hash[n].adicionar(num);
		
	
	}
	
	
	public void imprimir() {
		
		for(int i = 0; i < tamanho; i++) {
			
			System.out.print(i);
			System.out.print(" -> ");
			hash[i].imprimir();
			
		
		}
		
		
		
		
	}


	

}

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		String teste;
		
		String tam;
		
		teste = in.readLine();
		
		int t = Integer.parseInt(teste);
		
		Hash[] hashing = new Hash[t];
		
		
		for(int i = 0; i < t; i++) {
			
			
			tam = in.readLine();	
			
			String[] tamQtd = new String[2];
			
			tamQtd = tam.split(" ");
			
			int tamanho = Integer.parseInt(tamQtd[0]);
			
			int quant = Integer.parseInt(tamQtd[1]);
			
			hashing[i] = new Hash(tamanho, quant);
			
			String numeros;
			
			
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
			
			if(j < t - 1) {
				
				System.out.println();
				
			}
			
			
		}
		
		
	}

}

