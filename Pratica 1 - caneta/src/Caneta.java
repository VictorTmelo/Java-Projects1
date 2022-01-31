
public class Caneta {

	public String modelo;
	public String cor;
	public int carga;
	public boolean tampada;
	
	public void status() {
		
		System.out.println("modelo : " + getModelo());
		System.out.println("cor : " + getCor());
		System.out.println("carga : " + getCarga());
		System.out.println("está tampada : " + getTampada());
		
	}
	
public void tampar() {
		
		
		this.tampada = true;
		
	}
	
	
	public void destampar() {
		
		this.tampada = false;
		
	}
	
	
	
	
	
	public void rabiscar() {
		
	if(this.tampada == true) {
		
		System.out.println("erro! nao posso rabiscar");
		
	}
	else {
		
		System.out.println("estou rabiscando");
		
	}
	
	}
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	
	
}
