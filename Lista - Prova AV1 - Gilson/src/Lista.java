import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
	
		Scanner sc = new  Scanner(System.in);
		
		ListaDinamica lista = new ListaDinamica();
		
		int escolha = 0;
		
		while(escolha != 6){
			
			System.out.println("");
			System.out.println("1) Adicionar eletrodomestico na lista: ");
			System.out.println("2) Consumo mensal dos eletrodomesticos:  ");
			System.out.println("3) Custo mensal dos eletrodomesticos:  ");
			System.out.println("4) Consumo total dos eletrodomesticos:  ");
			System.out.println("5) Custo total dos eletrodomesticos:  ");
			System.out.println("6) Sair ");
			System.out.println("");
			escolha = sc.nextInt();
			
			if(escolha == 1){
				
				String tipo;
				double potencia;
				int quantidade;
				double tempo;
				
				System.out.println("Tipo do eletrodomestico: ");
				tipo = sc.next();
				
				System.out.println("Potencia do eletrodomestico: ");
				potencia = sc.nextDouble();
				
				System.out.println("Quantidade: ");
				quantidade = sc.nextInt();
				
				System.out.println("Tempo de uso em horas: ");
				tempo = sc.nextDouble();
				
				lista.adicionar(tipo, potencia, quantidade, tempo);
				
				
			}
			
			if(escolha == 2){
				
			
				lista.consumoMensal();
				
			}
			
			
			if(escolha ==3){
				
				
				lista.custoMensal();
				
			}
			
			
			if(escolha == 4){
				
				lista.consumoTotalMensal();
				
			}
			
			if(escolha == 5){
				
				
				
				lista.custoTotalMensal();
				
				
			}
			
			
			
		}
		
		

	}

}
