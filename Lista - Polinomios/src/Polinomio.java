
import java.util.Scanner;

public class Polinomio {
	
	public static void somaPolinomios(Lista l1, Lista l2) {
		
		
        No aux1, aux2;

        aux1 = l1.getPrimeiro();
        aux2 = l2.getPrimeiro();

        Lista l3 = new Lista();

        while(aux1 != null) {
            if (l1.comparar(aux2) != null) {
                l3.adicionar(aux1.getQuociente() + aux2.getQuociente(), aux1.getExpoente());
                //l2.comparar(aux1)
                aux1 = aux1.getProximo();
            } else if (l2.comparar(aux1) != null) {
                l3.adicionar(aux2.getQuociente() + aux1.getQuociente(), aux2.getExpoente());
                //l2.comparar(aux1)
                aux1 = aux2.getProximo();
            }
        }

        //Imprimir
        No aux = l3.getPrimeiro();
        System.out.println("Imprimindo a terceira lista de polinômios: \n----------------------------");
        while (aux != null) {
            System.out.println("(" + aux.getQuociente() + "x^" + aux.getExpoente() + ")");
            if (aux.getProximo() != null) {
                System.out.println(" + ");
            }
            aux = aux.getProximo();
        }
        //Fim imprimir
    }
	
    public static void main(String[] args) {
       
    	char resposta1;
        char resposta2;

        boolean j1 = true;
        boolean j2 = true;

        Scanner input = new Scanner(System.in);
        
        Lista l1 = new Lista();
        Lista l2 = new Lista();

//Primeira Lista


        while(j1 == true) {
            System.out.println("Insira o quociente da primeira lista: ");
            int q1 = input.nextInt();
            System.out.println("Insira o expoente da primeira lista: ");
            int e1 = input.nextInt();
            l1.adicionar(q1, e1);
            System.out.println("Deseja inserir outro polinômio?\n- S) Sim\n- N) Não");
            String r1 = input.next();
            resposta1 = r1.charAt(0);

            if(resposta1 == 'n' || resposta1 == 'N' ){
                j1 = false;
                break;
            }
        }


//Segunda Lista
        
        while(j2 == true) {
            System.out.println("Insira o quociente da segunda lista: ");
            int q2 = input.nextInt();
            System.out.println("Insira o expoente da segunda lista: ");
            int e2 = input.nextInt();
            l2.adicionar(q2, e2);
            System.out.println("Deseja inserir outro polinômio?\n- S) Sim\n- N) Não");
            String r2 = input.next();
            resposta2 = r2.charAt(0);
            if(resposta2 == 'n' || resposta2 == 'N'){
                j2 = false;
                break;
            }
        }
        
        
//Imprimindo listas

        System.out.println("Imprimindo a primeira lista de polinômios: ");
        System.out.println("");
        l1.imprimir();
        System.out.println("Imprimindo a segunda lista de polinômios: ");
        System.out.println("");
        l2.imprimir();
        
        somaPolinomios(l1,l2);
    }
    
}
