
public class Aniversariante implements Comparable {

	private String nome;
	private int mes;
	private int dia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}


	@Override
	public int compareTo(Object o) {
		int comparar = this.nome.compareTo(((Aniversariante) o).getNome());
		
		if(comparar < 0) {
			
			return -1;
		}
		
		if(comparar > 0) {
			
			return 1;
		}
		
		return 0;
	
	}
	

}
