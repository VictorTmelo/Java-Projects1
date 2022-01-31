
public class ProfessorGraduacao implements Professor, Colaborador{
	
	public int salario;
	public int cargahoraria;
	public float valorbasehora;
	public int titulacao;
	public String titulo;
	
	public void status() {
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      Professor de Graduação:                     ");
		System.out.println(getTitulo());
		System.out.println("Salário: " + getSalario() * 20);
		System.out.println("Carga Horária: " + this.cargahoraria);
		System.out.println("Valor base da hora: " + this.valorbasehora);
		System.out.println("-------------------------------------------------------------");
				
	}
	
	public int obtemSalario(int salario) {
		
		return salario;
		
	}
	
	public int cargaHoraria(int cargahoraria) {
		
		return cargahoraria;
		
	}
	
	public float valorbasehora(float valorbasehora) {
		
		return valorbasehora;
		
	}
	
	public int obtemTitulacao(int titulacao) {
		
		return titulacao;
		
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public float getValorbasehora() {
		return valorbasehora;
	}

	public void setValorbasehora(float valorbasehora) {
		this.valorbasehora = 35;
	}

	public int getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
