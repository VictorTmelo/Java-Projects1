import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new FileReader("src/logisim-win-2.7.1.exe")); 
        Scanner teclado = new Scanner(System.in);

        ArvoreAVL a = new ArvoreAVL();


        int escolha;

        do {

            System.out.println("\n1.Gerar codigo de autentica��o");
            System.out.println("2.Verifica��o de autenticidade");

            escolha = teclado.nextInt();

            if(escolha == 1) {

                while(br.ready()){ 

                    String linha = br.readLine(); 
                    a.adicionar(linha);

                } 



                System.out.print("Codigo de autentica��o: ");

                System.out.print(a.hash());

            }

            if(escolha == 2) {

                System.out.println("Digite um codigo para verificar a autenticidade:");

                String codigo = teclado.next();

                while(br.ready()){ 

                    String linha = br.readLine(); 
                    a.adicionar(linha);

                } 



                if(codigo.equals(a.hash())) {

                    System.out.println("O documento � autentico!");

                } else {

                    System.out.println("O documento n�o � autentico...");
                }
            }



        }while(escolha<3 && escolha > 0);

    }


}