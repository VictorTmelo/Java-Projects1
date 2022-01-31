import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		ListaDinamica estoque = new ListaDinamica();
		
		for(int i = 0; i < 1; i++) {
			
			String z;
			double y;
			int p;
			
			System.out.println("Digite o codigo do produto " + (i + 1) + " : ");
			z = sc.next();
			
			System.out.println("Digite o preço do produto " + (i + 1) + " : ");
			y = sc.nextInt();
			
			System.out.println("Digite  a quantidade do produto " + (i + 1) + " : ");
			p = sc.nextInt();
			
			System.out.println("Imprimindo dados do produto " + (i + 1 )+ " : ");
			System.out.println(" ");
			System.out.println("-------------------------------------------------------");
			estoque.adicionar(z, y, p);
			System.out.println("-------------------------------------------------------");
			System.out.println(" ");
		}
		
		int j;
		
		System.out.println("Quantos % você deseja diminuir do preço ? ");
		j = sc.nextInt();
		
		estoque.descontar(j);
		
		
	}

}
