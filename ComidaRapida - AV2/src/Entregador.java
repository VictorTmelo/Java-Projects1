
public class Entregador {

	private String nome;
	public String placa;
	
	public void status() {
		
		int lista[] = new int[4];
		
		int i = (int) Math.floor(Math.random()*4);
		
		if(i == 0) {
			this.nome = "Junior                      |";
			this.placa = "OAD3456";
		}
		if(i == 1) {
			this.nome = "Lucas                       |";
			this.placa = "OIN1234";
		}
		if(i == 2) {
			this.nome = "Ravi                        |";
			this.placa = "PNC7645";
		}
		if(i == 3) {
			this.nome = "Raul                        |";
			this.placa = "OVD1245";
		}
		
		lista[0] = 1;
		lista[1] = 2;
		lista[2] = 3;
		lista[3] = 4;

		System.out.println("|Entregador: " + getNome());
		System.out.println("|Placa do veículo: " + getPlaca() + "               |");

	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getPlaca() {
		
		return placa;
		
	}

	public void setPlaca(String placa) {
		
		this.placa = placa;
		
	}
}
