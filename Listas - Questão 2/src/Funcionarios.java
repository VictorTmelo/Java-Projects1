
public class Funcionarios {

	public static void main(String[] args) {
		
		
		ListaDinamica lista =  new ListaDinamica();
		
		lista.adicionar("Celso", 954);
		lista.adicionar("Igor", 682);
		lista.adicionar("Lucas", 915);
		lista.adicionar("Victor", 597);
		lista.adicionar("Travis", 955);
		
		lista.imprimir();
		lista.mediaSalario();
		lista.igualSalario();

		
	}

}
