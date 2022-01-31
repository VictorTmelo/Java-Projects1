import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estagiario e = new Estagiario();
		
		Funcionario f = new Funcionario();
		
		ProfessorTecnico ptec = new ProfessorTecnico();
		
		ProfessorGraduacao pgra = new ProfessorGraduacao();
			
		System.out.println("-------------------------------------------------------------");
		System.out.print("Informe a carga horária do estagiário: ");
		e.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do estagiário: ");
		e.setValorbasehora(sc.nextFloat());
		
		int salarioE = (int) (e.getCargahoraria() * e.getValorbasehora());
		e.setSalario(salarioE);
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga horária do funcionário: ");
		f.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do funcionário: ");
		f.setValorbasehora(sc.nextFloat());
		
		int salarioF = (int) ((f.getCargahoraria() * f.getValorbasehora()) * 2);
		f.setSalario(salarioF);
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga horária do professor técnico: ");
		ptec.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do professor técnico: ");
		ptec.setValorbasehora(sc.nextFloat());
		
		System.out.print("Informe a titulação do professor técnico:\n1-) Graduação.\n2-) Mestrado.\n3-) Doutorado.");
		int titulacaoPtec = sc.nextInt();
		ptec.setTitulacao(titulacaoPtec);
		
		if(titulacaoPtec == 1) {
			
			ptec.setTitulo("Título: Graduação.");
			System.out.println("A titulação do professor técnico é: Graduação.");
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1);
			pgra.setSalario(salarioPtec);
			
		}
		
		if(titulacaoPtec == 2) {
			
			ptec.setTitulo("Título: Mestrado.");
			System.out.println("A titulação do professor técnico é: Mestrado.");
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1.2);
			ptec.setSalario(salarioPtec);
			
		}
		
		if(titulacaoPtec == 3) {
			
			ptec.setTitulo("Título: Doutorado.");
			System.out.println("A titulação do professor técnico é: Doutorado.");	
			int salario = (int) (((ptec.getCargahoraria() * ptec.getValorbasehora()) * 3));
			int salarioPtec = (int) (salario * 1.5);
			ptec.setSalario(salarioPtec);
			
		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Informe a carga horária do professor de graduação: ");
		pgra.setCargahoraria(sc.nextInt());
		
		System.out.print("Informe o valor base da hora do professor de graduação: ");
		pgra.setValorbasehora(sc.nextFloat());
		
		System.out.print("Informe a titulação do professor de graduação:\n1-) Graduação.\n2-) Mestrado.\n3-) Doutorado. ");
		int titulacaoPgra = sc.nextInt();
		pgra.setTitulacao(titulacaoPgra);
		
		if(titulacaoPgra == 1) {
			
			pgra.setTitulo("Título: Graduação");
			System.out.println("A titulação do professor técnico é: Graduação.");
			int salario = (int) (((pgra.getCargahoraria() * pgra.getValorbasehora()) * 4));
			int salarioPgra = (int) (salario * 1);
			pgra.setSalario(salarioPgra);
			
		}
		
		if(titulacaoPgra == 2) {
			
			pgra.setTitulo("Título: Mestrado");
			System.out.println("A titulação do professor técnico é: Mestrado.");
			int salario = (int) (((pgra.getCargahoraria() * pgra.getValorbasehora()) * 4));
			int salarioPgra = (int) (salario * 1.2);
			pgra.setSalario(salarioPgra);
			
		}
		
		if(titulacaoPgra == 3) {
			
			pgra.setTitulo("Título: Doutorado");
			System.out.println("A titulação do professor técnico é: Doutorado.");			
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
