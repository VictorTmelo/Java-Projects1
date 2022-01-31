import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

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
