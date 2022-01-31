import java.util.Scanner;

public class Unifezes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno a = new Aluno();

		Professor p = new Professor();

		Bloco b = new Bloco();

		System.out.println("----------------------------------------------------");

		System.out.println("Informações do Aluno: ");

		System.out.println("----------------------------------------------------");

		System.out.print("Informe o nome do aluno: ");
		a.setNome(sc.next());
		System.out.print("Informe a matrícula do aluno: ");
		a.setMatricula(sc.nextInt());
		System.out.print("Informe a senha do aluno: ");
		a.setSenha(sc.nextInt());
		System.out.print("Informe a idade do aluno: ");
		a.setIdade(sc.nextInt());
		System.out.print("Informe a altura do aluno: ");
		a.setAltura(sc.nextFloat());
		System.out.print("Informe o peso do aluno em kg: ");
		a.setPeso(sc.nextFloat());
		System.out.println("Calouro: ");
		a.setCalouro(sc.nextBoolean());

		System.out.println("----------------------------------------------------");

		System.out.println("Informações do Professor: ");

		System.out.println("----------------------------------------------------");

		System.out.print("Informe o nome do professor: ");
		p.setNome(sc.next());
		System.out.print("Informe a especialização do professor: ");
		p.setEspecializacao(sc.next());
		System.out.print("Mestrado: ");
		p.setMestrado(sc.nextBoolean());
		System.out.print("Doutorado: ");
		p.setDoutorado(sc.nextBoolean());
		System.out.print("Informe a idade do professor: ");
		p.setIdade(sc.nextInt());
		System.out.print("Informe a altura do professor: ");
		p.setAltura(sc.nextFloat());
		System.out.print("Informe o peso do professor em kg: ");
		p.setPeso(sc.nextFloat());

		System.out.println("----------------------------------------------------");

		System.out.print("Informe o nome do bloco: ");
		b.setNomebloco(sc.next());
		System.out.print("Informe o curso do bloco: ");
		b.setCurso(sc.next());
		System.out.print("Laboratórios: ");
		b.setLab(sc.nextBoolean());
		System.out.print("Informe a quantidade de andares: ");
		b.setAndares(sc.nextInt());

		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		a.status();
		System.out.println("----------------------------------------------------");
		p.status();
		System.out.println("----------------------------------------------------");
		b.status();

	}

}
