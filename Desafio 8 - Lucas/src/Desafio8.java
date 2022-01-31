import java.util.Arrays;
import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int escolha;
		
		
         Aniversariante[] niver = new Aniversariante[15];
		
		
		for(int i = 0; i < 100; i ++) {
			
			System.out.println("Escolha uma das opções abaixo");
			System.out.println("1.Cadastrar pesssoa na agenda de aniversariantes");
			System.out.println("2.Excluir pessoa a partir do nome");
			System.out.println("3.Alterar dia ou mês a partir do nome");
			System.out.println("4.Consultar aniversariantes de uma data");
			System.out.println("5.Consultar aniversariantes por mês");
			System.out.println("6.Consultar aniversariantes pela letra inicial do nome");
			System.out.println("7.Mostrar toda agenda ordenada pelo nome");	
			System.out.println("8.Mostrar toda a agenda ordenada por mês");
			System.out.println("9.Sair");
			
			escolha = teclado.nextInt();
			
			if(escolha == 1) {
				
				System.out.println("######INCLUIR DADOS######");
				
				for(int j = 0 ; j < 15; j++) {
					
					niver[j] = new Aniversariante();
					
					System.out.print("Informe o nome que deseja incluir na agenda: ");
			
					niver[j].setNome(teclado.next());
					
					System.out.print("Informe o dia do aniversário: ");
					
					niver[j].setDia(teclado.nextInt());
					
					System.out.print("Informe o mês do aniversario(Represente em numero): ");
					
					niver[j].setMes(teclado.nextInt());
				}
				System.out.println("######INCLUIR DADOS######");
				System.out.println("");
			}
				
		   if(escolha == 2) {
			   
			   System.out.println("#######EXCLUIR NOMES######");
			   System.out.println("Informe o nome da pessoa que deseja excluir da agenda");
			   
			   String excluir = teclado.next();
			   
			   for(int j = 0 ; j < 15; j++) {
					
				if(excluir.equals(niver[j].getNome())) {
						
						System.out.println("O nome " + niver[j].getNome() + " foi excluido com sucesso");
				
						niver[j].setNome("");
					
						
						
					}
					
				}
			   System.out.println("#######EXCLUIR NOMES######");
			   System.out.println("");
		   }
		   
		   if(escolha == 3) {
			   
			   System.out.println("######ALTERAÇÃO DE DATA######");
			   System.out.print("Informe o nome da pessoa que deseja modificar a data: ");
			   
			   String modData = teclado.next();
			   
			   for(int j = 0 ; j < 15; j++) {
				   
		         if(modData.equals(niver[j].getNome())) {
		        	 
		        	 System.out.print("Informe o novo dia que deseja colocar para essa pessoa: ");
		        	 
		        	 int novoDia = teclado.nextInt();
		        	 
		        	 niver[j].setDia(novoDia);
		        	 
                     System.out.print("Informe o novo mês que deseja colocar para essa pessoa(represente em numero): ");
		        	 
		        	 int novoMes = teclado.nextInt();
		        	 
		        	 niver[j].setMes(novoMes);
		         }
				   
			   }
			   
			   System.out.println("######ALTERAÇÃO DE DATA######");
			   System.out.println("");
		   }
		   
		   if(escolha == 4) {
			   
			   System.out.println("######CONSULTA POR DATA######");
			   System.out.print("Informe o dia que o aniversariante nasceu: ");
			   
			   int verificaDia = teclado.nextInt();
			   
			   System.out.print("Informe o mes que o aniversariante nasceu(represente em numero): ");
			   
			   int verificaMes = teclado.nextInt();
			   
			   for(int j = 0; j < 15; j ++) {
				   
				   if(niver[j].getNome().contentEquals("")) {
					   
				 		  
						
				   } else {
			   
			     if(verificaDia == niver[j].getDia() && verificaMes == niver[j].getMes()) {
				   
				   System.out.println("Nome do aniversariante: " + niver[j].getNome() + ", Dia do aniversario: " + niver[j].getDia() + ", Mês do anversario: " + niver[j].getMes());
			     }
				    
			    }
				   
			   }
			   
			   System.out.println("######CONSULTA POR DATA######");
			   System.out.println("");
			   
		   }
		   
		   if(escolha == 5) {
			   
			   System.out.println("######CONSULTA POR MES######");
			   System.out.print("Informe o mes que o aniversariante nasceu(represente em numero): ");
			   
			   int verificaMess = teclado.nextInt();
			   
			   for(int j = 0; j < 15; j++) {
				   
				   if(niver[j].getNome().contentEquals("")) {
					   
				 		  
						
				   } else {
				   
				   if(verificaMess == niver[j].getMes()) {
					   
					   System.out.println("Nome do aniversariante: " + niver[j].getNome() + ", Dia do aniversario: " + niver[j].getDia() + ", Mês do anversario: " + niver[j].getMes());
				   }
			     }
			   }
			   System.out.println("######CONSULTA POR MES######");
			   System.out.println("");
		   }
		   
		   if(escolha == 6) {
			   
			   System.out.println("######CONSULTA POR LETRA INICIAL######");
			   System.out.println("Informe a letra inicial do aniversariante: ");
			   
			   String verificaInicial = teclado.next();
			   
			   for(int j = 0; j < 15;j++) {
				   
				   if(niver[j].getNome().contentEquals("")) {
					   
				 		  
						
				   } else {
				   
				   String inicial;
				   
				   inicial = niver[j].getNome();
				   
				   
				   if(inicial.startsWith(verificaInicial)) {
					   
					   System.out.println("Nome do aniversariante: " + niver[j].getNome() + ", Dia do aniversario: " + niver[j].getDia() + ", Mês do anversario: " + niver[j].getMes());
				   }
                 
			      }
			   }
			   
			   System.out.println("######CONSULTA POR LETRA INICIAL######");
			   System.out.println("");
			   
		   }
		   
		   if(escolha == 7) {
			   
               System.out.println("");
			   System.out.println("######PALAVRAS ORDENADAS######");
			   
			   
			   
			   for(int j = 0 ; j < 15; j++) {
				   
				
				   Arrays.sort(niver);
				   
				   if(niver[j].getNome().contentEquals("")) {
					   
				 		  
						
				   } else {
				   
				   System.out.println("Nome: " + niver[j].getNome() + ", Mês: " + niver[j].getMes() + ", Dia: " + niver[j].getDia());
				   
			   
			      }
			   }
			   
			   System.out.println("######PALAVRAS ORDENADAS######");
			   System.out.println("");
		   }
	
		      
		   if(escolha == 8) {
			   
			
			   System.out.println("");
			   System.out.println("######MESES ORDENADOS######");
			   
			  
			    
			   
			   for(int k = 1; k <= niver.length-1;k++) {
				   
				   for(int j = 0; j < niver.length - k;j++) {
					   
					  
						   
					   
					  String auxNome = niver[j].getNome();
					  int auxDia = niver[j].getDia();
					  int auxMes = niver[j].getMes();
					  String auxNome2 = niver[j+1].getNome();
					  int auxDia2 = niver[j+1].getDia();
					  int auxMes2 = niver[j+1].getMes();
					   
					   if(niver[j].getMes() > niver[j+1].getMes()) {
						   
						      niver[j].setNome(auxNome2);
							  niver[j].setDia(auxDia2);
							  niver[j].setMes(auxMes2);
							  niver[j+1].setNome(auxNome);
							  niver[j+1].setDia(auxDia);
							  niver[j+1].setMes(auxMes);


					   }
					   
				   }
		
			    }
			   
			   
			   for(int j = 0;j < 15;j ++) {
				   
				   if(niver[j].getNome().contentEquals("")) {
					   
					   
				   } else {
				   
				   System.out.println("Nome: " + niver[j].getNome() + ", Mês: " + niver[j].getMes() + " , Dia: " + niver[j].getDia());
			     }
			   }
			   
			   System.out.println("######MESES ORDENADOS######");
			   System.out.println("");
		   }
			
			if(escolha == 9) {
				
				System.out.println("Você saiu do programa");
				break;
			}
		}
		
	}
}
