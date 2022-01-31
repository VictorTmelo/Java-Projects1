//PROGRAMA VETOR: MANEIRA MAIS FACIL

import java.util.Scanner;

public class Vetor {

public static void main(String[] args) {
 
 int lista[] = new int[5];
 
 Scanner sc = new Scanner(System.in);
 
 int opcao;
 
 for(int i = 0; i < 100; i++) {
 System.out.println("-------------------------------------------------------------------------");
 System.out.println("1) Incluir um número no vetor.");
 System.out.println("2) Consultar todos os números do vetor.");
 System.out.println("3) Consultar um número do vetor");
 System.out.println("4) Excluir um número no vetor.");
 System.out.println("5) Esvaziar o vetor");
 System.out.println("6) Sair.");
 
 System.out.println("Informe a opção desejada: ");
 opcao = sc.nextInt();
 
 if(opcao == 1) {
  
  for(int j = 0; j < 5; j++) {
  System.out.print("Informe um número que deseja inserir na lista: ");
  lista[j] = sc.nextInt();
  }
  
  System.out.print("Lista: ");
  
  for(int j = 0; j < 5; j++) {
	  

	  System.out.print(lista[j] + " ");
  }
  
    System.out.println();
  
 }
 
 if(opcao == 2) {
  System.out.println("Consultando todos os números do vetor: ");
  
for(int j = 0; j < 5; j++) {
	  

	  System.out.print(lista[j] + " ");
  }
  
    System.out.println();
  
 }
 
 
 if(opcao == 3) {
  System.out.println("Informe uma posição que deseja consultar: ");
  int posicao = sc.nextInt();
  
  if(posicao == 1) {
   System.out.println("O número que está na posição " + posicao + " é: " + lista[0]);
  }
  
  if(posicao == 2) {
   System.out.println("O número que está na posição " + posicao + " é: " + lista[1]);
  }
  
  if(posicao == 3) {
   System.out.println("O número que está na posição " + posicao + " é: " + lista[2]);
  }
  
  if(posicao == 4) {
   System.out.println("O número que está na posição " + posicao + " é: " + lista[3]);
  }
  
  if(posicao == 5) {
   System.out.println("O número que está na posição " + posicao + " é: " + lista[4]);
  }
  
  
 }
 
   if(opcao == 4) {
  System.out.println("Informe a posicão que deseja excluir do vetor: ");
  int excluir = sc.nextInt();
  
  if(excluir == 1) {
   System.out.println("O número excluído da posição " + excluir + " foi: " + lista[0]);
   lista[0] = 0;
   
  }
  
  if(excluir == 2) {
   System.out.println("O número excluído da posição " + excluir + " foi: " + lista[1]);
   lista[1] = 0;
   
  }
  
  if(excluir == 3) {
   System.out.println("O número excluído da posição " + excluir + " foi: " + lista[2]);
   lista[2] = 0;
   
  }
  
  if(excluir == 4) {
   System.out.println("O número excluído da posição " + excluir + " foi: " + lista[3]);
   lista[3] = 0;
   
  }
  
  if(excluir == 5) {
   System.out.println("O número excluído da posição " + excluir + " foi: " + lista[4]);
   lista[4] = 0;
   
  }

   }
  
   if(opcao == 5) {
  System.out.println("Esvaziando o vetor: ");
  
  for(int v = 0; v<5; v++)
  {
	lista[v] = 0;  
	  
  }
  
  System.out.println("Lista esvaziada com sucesso: " + lista[0] + lista[1] + lista[2] + lista[3] + lista[4]);
 }
 
   if(opcao == 6) {
 
    System.out.println("Deseja sair?");
    System.out.println("Digite 1 para encerrar o programa");
    System.out.println("Digite 2 para reiniciar o programa");
    int resposta = sc.nextInt();
 
    if(resposta == 1) {
     System.out.println("Programa encerrado com sucesso.");
     break;
    }
    if(resposta == 2) {
     sc.reset();
    }
 
   }
 
 }
 
  sc.close();
  
}

}


//PROGRAMA VETOR: MANEIRA DAVI

//import java.util.Scanner;
//import java.util.ArrayList;


//public class Main {

//public static void main(String[] args) {
 
 //ArrayList<String> lista = new ArrayList(5);
 
 //Scanner sc = new Scanner(System.in);
 
 //int opcao;
 
 //for(int i = 0; i < 100; i++) {
 //System.out.println("-------------------------------------------------------------------------");
 //System.out.println("1) Incluir um número no vetor.");
 //System.out.println("2) Consultar todos os números do vetor.");
 //System.out.println("3) Consultar um número do vetor");
 //System.out.println("4) Excluir um número no vetor.");
 //System.out.println("5) Esvaziar o vetor");
 //System.out.println("6) Sair.");
 
 //System.out.println("Informe a opção desejada: ");
 //opcao = sc.nextInt();
 
 //if(opcao == 1) {
  
 // for(int j = 0; j < 5; j++) {
  //System.out.print("Informe um número que deseja inserir na lista: ");
  //lista.add(sc.next());
  //}
  
  //System.out.println("Lista: " + lista);

  
// }
 
 //if(opcao == 2) {
  //System.out.println("Consultando todos os números do vetor: " + lista);
 //}
 
 
 //if(opcao == 3) {
  //System.out.println("Informe uma posição que deseja consultar: ");
  //int posicao = sc.nextInt();
  
  //if(posicao == 1) {
  // System.out.println("O número que está na posição " + posicao + " é: " + lista.get(0));
  //}
  
  //if(posicao == 2) {
  // System.out.println("O número que está na posição " + posicao + " é: " + lista.get(1));
  //}
  
  //if(posicao == 3) {
   //System.out.println("O número que está na posição " + posicao + " é: " + lista.get(2));
  //}
  
  //if(posicao == 4) {
   //System.out.println("O número que está na posição " + posicao + " é: " + lista.get(3));
  //}
  
  //if(posicao == 5) {
   //System.out.println("O número que está na posição " + posicao + " é: " + lista.get(4));
  //}
  
  
 //}
 
   //if(opcao == 4) {
  //System.out.println("Informe a posicão que deseja excluir do vetor: ");
  //int excluir = sc.nextInt();
  
  //if(excluir == 1) {
   //System.out.println("O número excluído da posição " + excluir + " foi: " + lista.get(0));
   //lista.remove(0);
   //System.out.println("Lista: " + lista);
  //}
  
  //if(excluir == 2) {
  //System.out.println("O número excluído da posição " + excluir + " foi: " + lista.get(1));
  //lista.remove(1);
  //System.out.println("Lista: " + lista);
  //}
  
  //if(excluir == 3) {
   //System.out.println("O número excluído da posição " + excluir + " foi: " + lista.get(2));
   //lista.remove(2);
   //System.out.println("Lista: " + lista);
  //}
  
  //if(excluir == 4) {
   //System.out.println("O número excluído da posição " + excluir + " foi: " + lista.get(3));
   //lista.remove(3);
   //System.out.println("Lista: " + lista);
  //}
  
  //if(excluir == 5) {
   //System.out.println("O número excluído da posição " + excluir + " foi: " + lista.get(4));
   //lista.remove(4);
   //System.out.println("Lista: " + lista);
  //}

   //}
  
   //if(opcao == 5) {
  //System.out.println("Esvaziando o vetor: " + lista.removeAll(lista));
  //System.out.println("Lista esvaziada com sucesso: " + lista);
 //}
 
  // if(opcao == 6) {
 
   // System.out.println("Deseja sair?");
   // System.out.println("Digite 1 para encerrar o programa");
   // System.out.println("Digite 2 para reiniciar o programa");
   // int resposta = sc.nextInt();
 
    //if(resposta == 1) {
     //System.out.println("Programa encerrado com sucesso.");
     //break;
    //}
    //if(resposta == 2) {
     //sc.reset();
    //}
 
   //}
 
 //}
  
//}

//}









