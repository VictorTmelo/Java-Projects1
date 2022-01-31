
public class Main {

	public static void main(String[] args) {
		
		SetOfStacks pilhaTotal = new SetOfStacks();
		
		System.out.print("Fundo   ");
		
		for(int i = 0 ; i < 49; i++) {
			
		pilhaTotal.adicionar(i);
			
		}
		
		pilhaTotal.excluir(); 
		pilhaTotal.excluir(); 
		pilhaTotal.excluir(); 
		pilhaTotal.excluir();
		pilhaTotal.excluir(); 

		pilhaTotal.exibir();
		System.out.print("  Topo");
		
		
		
	}

}
