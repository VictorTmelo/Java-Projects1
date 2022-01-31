import java.util.Scanner;

public class ComidaRapida {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
	
		Cliente c = new Cliente();
		
		Pedido p = new Pedido();
		
		Pagamento pag = new Pagamento();
		
		Entregador e = new Entregador();
		
		Lanche l = new Lanche();
		
		Refeição r = new Refeição();
		
		Sobremesa s = new Sobremesa();
		
		Bebida b = new Bebida();
		
		b.quantidade();
	    
		for(int i = 0; i == 0; i++) {
	        	
			int opção;
			
	        System.out.println("Você deseja fazer um pedido?");
			System.out.println("1) Sim ");
			System.out.println("2) Não ");
			System.out.println("Informe a opção desejada: ");
	        opção = sc.nextInt();
			
	        if(opção == 1) {
	        	
	        //TUDO
	        	
	        int opção2;	
	        	
	        // DADOS DO CLIENTE
	        	
	        System.out.print("Digite o nome do cliente: ");	
	        c.setNome(sc.next());
	   
	        System.out.print("Digite o endereço do cliente:");
	        c.setEndereço(sc.next());
	        
	        System.out.print("Digite o telefone do cliente: ");
	        c.setTelefone(sc.nextInt());
	        
	        System.out.print("Digite um ponto de referência: ");
	        c.setReferencia(sc.next());
	        	
	        // DADOS DO PEDIDO
	        
	        System.out.println("Qual item do cardapio você deseja? ");
	        System.out.println("1) Lanche ");
	        System.out.println("2) Refeição ");
	        System.out.println("3) Bebida ");
	        System.out.println("4) Sobremesa ");
	        System.out.print("Informe a opção desejada: ");
	        opção2 = sc.nextInt();
	        
	        if(opção2 == 1) {
	        	
	        	System.out.println("Qual lanche você deseja? ");
	        	System.out.println("1) Burger (R$ 20,00 reais) ");
	        	System.out.println("2) Fritas (R$ 10,00 reais) ");
	        	System.out.println("3) Pastel (R$ 5,00 reais) ");
	        	System.out.print("Informe a opção desejada: ");
	        	l.setTipo(sc.nextInt());
	        	l.status();
	        	
	        }
	        if(opção2 == 2) {

	        	System.out.println("Qual refeição você deseja? ");
	        	System.out.println("1) Combo - Burger + Fritas + Refrigerante (R$ 30,00 reais) ");
	        	System.out.println("2) Pizza Grande - 12 fatias (R$ 50,00 reais) ");
	        	System.out.println("3) Combinado de sushis - 20 unidades (R$ 40,00 reais) ");
	        	System.out.print("Informe a opção desejada: ");
	        	r.setTipo(sc.nextInt());
	        	r.status();
	        	
	        }
	        if(opção2 == 3){
	        	
	        	int quant;
	        	System.out.println("Qual bebida você deseja?");
	        	System.out.println("1) Refrigerante (R$ 8,00 reais)");
	        	System.out.println("2) Suco (R$ 5,00 reais)");
	        	System.out.println("3) Água (R$ 2,00 reais)");
	        	System.out.print("Informe a opção desejada: ");
	        	b.setTipo(sc.nextInt());	        
	        	System.out.print("Informe a quantidade: ");
	        	quant = sc.nextInt();
	        	b.setQuantpedida(quant);
	        	if(quant > b.getQuantidade()) {
	        		System.out.print("Não foi possível realizar pedido. Estoque em falta.");
	        		
	        		break;
	        	}else {
	        		
	        		b.setQuantidade(b.getQuantidade() - quant);
		        	b.status();
	        		
	        	}
	        	
	        }
	        
	        if(opção2 == 4){
	        	
	        	System.out.println("Qual sobremesa você deseja?");
	        	System.out.println("1) Bolo (R$ 15,00 reais) ");
	        	System.out.println("2) Torta (R$ 20,00 reais) ");
	        	System.out.println("3) Sorvete (R$ 10,00 reais) ");
	        	System.out.print("Informe a opção desejada: ");
	        	s.setTipo(sc.nextInt());
	        	s.status();
	        	
	        }
	        
	        System.out.println("Qual a forma de pagamento desejada?");
	        System.out.println("1) Dinheiro");
	        System.out.println("2) Cheque");
	        System.out.print("Informe a opção desejada: ");
	        int opção3 = sc.nextInt();
	        pag.setTipo(opção3);
	        
	        if(opção3 == 2) {
	        	System.out.print("Informe o número do cheque: ");
	        	pag.setNum(sc.nextInt());
	        	System.out.print("Informe o número da conta: ");
	        	pag.setConta(sc.nextInt());
	        	System.out.print("Informe a agência: ");
	        	pag.setAgencia(sc.nextInt());
	        	System.out.print("Informe o banco: ");
	        	pag.setBanco(sc.next());
	        }
	        
	        
	        
	     }
	        if(opção == 2) {
	        	
	        	System.out.println("|************************|");
	        	System.out.println("|Obrigado e volte sempre!|");
	        	System.out.println("|************************|");
	        	break;
	        	
	        } 
	        
	        System.out.println("Dados do pedido: ");
			
			c.status();
			pag.status();
			e.status();
			p.status();
	        
	        
		}
		
		for(int j = 0; j < 4; j++) {
        	
			int opção;
			
        	System.out.println("Você deseja pedir algo mais?");
			System.out.println("1) Sim ");
			System.out.println("2) Não ");
			System.out.println("Informe a opção desejada: ");
	        opção = sc.nextInt();
        	
        	if(opção == 1) {
	        	
    	        //TUDO	        	
    	        	
    	        // DADOS DO PEDIDO
    	        
    	        System.out.println("Qual item do cardápio você deseja? ");
    	        System.out.println("1) Lanche ");
    	        System.out.println("2) Refeição ");
    	        System.out.println("3) Bebida ");
    	        System.out.println("4) Sobremesa ");
    	        System.out.print("Informe a opção desejada: ");
    	        int opção2 = sc.nextInt();
    	       
    	        if(opção2 == 1) {
    	        	
    	        	System.out.println("Qual lanche você deseja? ");
    	        	System.out.println("1) Burger (R$ 20,00 reais) ");
    	        	System.out.println("2) Fritas (R$ 10,00 reais) ");
    	        	System.out.println("3) Pastel (R$ 5,00 reais) ");
    	        	System.out.print("Informe a opção desejada: ");
    	        	l.setTipo(sc.nextInt());
    	        	l.status();
    	        	
    	        }
    	        if(opção2 == 2) {

    	        	System.out.println("Qual refeição você deseja? ");
    	        	System.out.println("1) Combo - Burger + Fritas + Refrigerante (R$ 30,00 reais) ");
    	        	System.out.println("2) Pizza Grande - 12 fatias (R$ 50,00 reais) ");
    	        	System.out.println("3) Combinado de sushis - 20 unidades (R$ 40,00 reais) ");
    	        	System.out.print("Informe a opção desejada: ");
    	        	r.setTipo(sc.nextInt());
    	        	r.status();
    	        	
    	        }
    	        if(opção2 == 3){
    	        	
    	        	int quant;
    	        	System.out.println("Qual bebida você deseja?");
    	        	System.out.println("1) Refrigerante (R$ 8,00 reais)");
    	        	System.out.println("2) Suco (R$ 5,00 reais)");
    	        	System.out.println("3) Água (R$ 2,00 reais)");
    	        	System.out.print("Informe a opção desejada: ");
    	        	b.setTipo(sc.nextInt());
    	        	System.out.print("Informe a quantidade: ");
    	        	quant = sc.nextInt();
    	        	b.setQuantpedida(quant);
    	        	if(quant > b.getQuantidade()) {
    	        		System.out.print("Não foi possível realizar pedido. Estoque em falta.");
    	        		
    	        		break;
    	        	}else {
    	        		
    	        		b.setQuantidade(b.getQuantidade() - quant);
        	        	b.status();
    	        		
    	        	}
    	        
    	        }
    	        
    	        if(opção2 == 4){
    	        	
    	        	System.out.println("Qual sobremesa você deseja?");
    	        	System.out.println("1) Bolo (R$ 15,00 reais) ");
    	        	System.out.println("2) Torta (R$ 20,00 reais) ");
    	        	System.out.println("3) Sorvete (R$ 10,00 reais) ");
    	        	System.out.print("Informe a opção desejada: ");
    	        	s.setTipo(sc.nextInt());
    	        	s.status();
    	        	
    	        }
    	        
    	        System.out.println("Qual a forma de pagamento desejada?");
    	        System.out.println("1) Dinheiro");
    	        System.out.println("2) Cheque");
    	        System.out.print("Informe a opção desejada: ");
    	        int opção3 = sc.nextInt();
    	        pag.setTipo(opção3);
    	        
    	        if(opção3 == 2) {
    	        	System.out.print("Informe o número do cheque: ");
    	        	pag.setNum(sc.nextInt());
    	        	System.out.print("Informe o número da conta: ");
    	        	pag.setConta(sc.nextInt());
    	        	System.out.print("Informe a agência: ");
    	        	pag.setAgencia(sc.nextInt());
    	        	System.out.print("Informe o banco: ");
    	        	pag.setBanco(sc.next());
    	        }
    	        
    	        
    	        
    	     }
    	        if(opção == 2) {
    	        	System.out.println("Finalizando pedido...");
    	        	System.out.println("Pedido finalizado com sucesso!");
    	        	System.out.println("|************************|");
    	        	System.out.println("|Obrigado e volte sempre!|");
    	        	System.out.println("|************************|");
    	        	break;
    	        	
    	        }    	        
    	        
    	        System.out.println("Dados do pedido: ");
    			
    			c.status();
    			pag.status();
    			e.status();
    			p.status();
    	        
        }
		
		
		
        sc.close();
        
	}

}