
public class Funcionario implements Colaborador{
	
	public int salario;
	public int cargahoraria;
	public float valorbasehora;
	
	public void status() {
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("                           Funcion�rio:                 ");
		System.out.println("Sal�rio: " + getSalario() * 20);
		System.out.println("Carga Hor�ria: " + this.cargahoraria);
		System.out.println("Valor base da hora: " + this.valorbasehora);
		
	}
	
	public int obtemSalario(int salario) {
		
		return salario = (int) (cargahoraria * valorbasehora * 2);
		
	}
	
	public int cargaHoraria(int cargahoraria) {
		
		return cargahoraria;
		
	}
	
	public float valorbasehora(float valorbasehora) {
		
		return valorbasehora;
		
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = (int) (cargahoraria * valorbasehora * 2);
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
		this.valorbasehora = 15;
	}

}
