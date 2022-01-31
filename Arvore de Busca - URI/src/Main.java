import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static class No {

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
	
	
	
	public static class Tree {

	    private No raiz;
	    private int quantidade;

	    public Tree() {

	        raiz = null;

	        quantidade = 0;

	    }



	    public void adicionar(int n) {

	        if(raiz == null) {

	            raiz = new No(n);

	        }else {

	            raiz.add(n);


	        }



	    }



	    public void preOrdem(No n) {

	        System.out.print(" " + n.getNum());

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

	        System.out.print(" " + n.getNum());

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

	        System.out.print(" " + n.getNum());

	    }


	    public void search() {



	    }



	    public No getRaiz() {
	        return raiz;
	    }



	    public void setRaiz(No raiz) {
	        this.raiz = raiz;
	    }



	    public int getQuantidade() {
	        return quantidade;
	    }



	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }


	}
	
	

	 public static void main(String[] args) throws IOException {

	        InputStreamReader ir = new InputStreamReader(System.in);
	        BufferedReader in = new BufferedReader(ir);

	        String teste;

	        String quant;

	        String numeros;

	        //QUANTIDADE DE TESTES

	        teste = in.readLine();

	        int t = Integer.parseInt(teste);

	        Tree[] arvore = new Tree[t];

	        for(int i = 0; i < t; i++){

	            //QUANTIDADE DE NUMEROS A SEREM ADICIONADOS

	            quant = in.readLine();

	            int qtd = Integer.parseInt(quant);

	            arvore[i] = new Tree();

	            //NUMEROS

	            numeros = in.readLine();

	            String[] num = numeros.split(" ");

	            for(int j = 0; j < qtd; j++) {

	                int x = Integer.parseInt(num[j]);
	                arvore[i].adicionar(x);

	            }

	        }

	            for(int y = 0; y < t; y++){

	                System.out.println("Case " + (y + 1) + ":");

	                System.out.print("Pre.:");

	                arvore[y].preOrdem(arvore[y].getRaiz());

	               System.out.println();;

	                System.out.print("In..:");

	               arvore[y].emOrdem(arvore[y].getRaiz());

	                System.out.println();

	                System.out.print("Post:");

	                arvore[y].posOrdem(arvore[y].getRaiz());

	                System.out.println();

	                System.out.println();

	            }



	    }

}
