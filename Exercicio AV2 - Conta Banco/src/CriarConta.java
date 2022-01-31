import java.util.Scanner;

public class CriarConta {

	public static void main(String[] args) {
		
		int tipo;
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente cc = new ContaCorrente();
		
		ContaPoupan�a cp = new ContaPoupan�a();
		
		System.out.println("Qual tipo de conta dever� ser aberta? 1 - corrente ou 2 - poupan�a ");
		tipo = sc.nextInt();
		
		if(tipo == 1) {
			
			cc.abrirConta();
			
			System.out.println("Nome do dono da conta corrente: ");
			cc.setDono(sc.next());
			
			System.out.println("Numero da conta corrente: ");
			cc.setNum(sc.nextInt());
			
			System.out.println("Qual valor deseja depositar: ");
			cc.depositar(sc.nextInt());
			
			System.out.println("Qual valor deseja sacar : ");
			cc.sacar(sc.nextInt());
			
			System.out.println("Mostrando estado atual da conta corrente: ");
			
			cc.estadoAtual();
		}
		
		if(tipo == 2) {
			
			cp.abrirConta();
			
			System.out.println("Nome do dono da conta poupan�a: ");
			cp.setDono(sc.next());
			
			System.out.println("Numero da conta poupan�a: ");
			cp.setNum(sc.nextInt());
			
			System.out.println("Qual valor deseja depositar: ");
			cp.depositar(sc.nextInt());
			
			System.out.println("Qual valor deseja sacar : ");
			cp.sacar(sc.nextInt());
			
			System.out.println("Mostrando estado atual da conta poupan�a: ");
			
			cp.estadoAtual();
			
		}
		
		
		
	}

}
