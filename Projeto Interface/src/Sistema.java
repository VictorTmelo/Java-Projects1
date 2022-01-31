import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estagiario e = new Estagiario();
		
		Funcionario f = new Funcionario();
		
		ProfessorTecnico ptec = new ProfessorTecnico();
		
		ProfessorGraduacao pgra = new ProfessorGraduacao();
			
		System.out.println("-------------------------------------------------------------");
		System.out.print("Informe a carga hor�ria do estagi�rio: ");
		e.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do estagi�rio: ");
		e.setValorbasehora(sc.nextFloat());
		
		int salarioE = (int) (e.getCargahoraria() * e.getValorbasehora());
		e.setSalario(salarioE);
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga hor�ria do funcion�rio: ");
		f.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do funcion�rio: ");
		f.setValorbasehora(sc.nextFloat());
		
		int salarioF = (int) ((f.getCargahoraria() * f.getValorbasehora()) * 2);
		f.setSalario(salarioF);
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga hor�ria do professor t�cnico: ");
		ptec.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do professor t�cnico: ");
		ptec.setValorbasehora(sc.nextFloat());
		
		System.out.print("Informe a titula��o do professor t�cnico:\n1-) Gradua��o.\n2-) Mestrado.\n3-) Doutorado.");
		int titulacaoPtec = sc.nextInt();
		ptec.setTitulacao(titulacaoPtec);
		
		if(titulacaoPtec == 1) {
			
			ptec.setTitulo("T�tulo: Gradua��o.");
			System.out.println("A titula��o do professor t�cnico �: Gradua��o.");
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1);
			pgra.setSalario(salarioPtec);
			
		}
		
		if(titulacaoPtec == 2) {
			
			ptec.setTitulo("T�tulo: Mestrado.");
			System.out.println("A titula��o do professor t�cnico �: Mestrado.");
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1.2);
			ptec.setSalario(salarioPtec);
			
		}
		
		if(titulacaoPtec == 3) {
			
			ptec.setTitulo("T�tulo: Doutorado.");
			System.out.println("A titula��o do professor t�cnico �: Doutorado.");	
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1.5);
			ptec.setSalario(salarioPtec);
			
		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga hor�ria do professor de gradua��o: ");
		pgra.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do professor de gradua��o: ");
		pgra.setValorbasehora(sc.nextFloat());
		
		System.out.print("Informe a titula��o do professor de gradua��o:\n1-) Gradua��o.\n2-) Mestrado.\n3-) Doutorado. ");
		int titulacaoPgra = sc.nextInt();
		pgra.setTitulacao(titulacaoPgra);
		
		if(titulacaoPgra == 1) {
			
			pgra.setTitulo("T�tulo: Gradua��o");
			System.out.println("A titula��o do professor t�cnico �: Gradua��o.");
			int salario = (int) (((pgra.getCargahoraria() * pgra.getValorbasehora()) * 4));
			int salarioPgra = (int) (salario * 1);
			pgra.setSalario(salarioPgra);
			
		}
		
		if(titulacaoPgra == 2) {
			
			pgra.setTitulo("T�tulo: Mestrado");
			System.out.println("A titula��o do professor t�cnico �: Mestrado.");
			int salario = (int) (((pgra.getCargahoraria() * pgra.getValorbasehora()) * 4));
			int salarioPgra = (int) (salario * 1.2);
			pgra.setSalario(salarioPgra);
			
		}
		
		if(titulacaoPgra == 3) {
			
			pgra.setTitulo("T�tulo: Doutorado");
			System.out.println("A titula��o do professor t�cnico �: Doutorado.");			
			int salario = (int) (((pgra.getCargahoraria() * pgra.getValorbasehora()) * 4));
			int salarioPgra = (int) (salario * 1.5);
			pgra.setSalario(salarioPgra);
			
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		e.status();
		f.status();
		ptec.status();
		pgra.status();
		
		sc.close();

	}

}
