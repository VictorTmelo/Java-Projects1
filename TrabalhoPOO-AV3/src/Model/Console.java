package Model;

public abstract class Console {

  private String cor;
  private int quantidade;
  private int pre�o;
  
  public abstract void status();
	  
  
  public void calcularPre�o(String tipo, String cor, int quantidade) {
	  
	 
	  
	 if(tipo == "Xbox360" && cor == "Preto") {
		 
		this.pre�o = 1000 * quantidade;
		 
	 }
	 
	 
	 if(tipo == "Xbox360" && cor == "Branco") {
		 
		 this.pre�o = 1200 * quantidade;
	 }
	 
	 
	 if((tipo == "XboxOne" || tipo == "Xbox One") && cor == "Preto") {
		 
		 this.pre�o = 1500 * quantidade;
	 }
	 
	 
     if((tipo == "XboxOne" || tipo == "Xbox One") && cor == "Branco") {
		 
		 this.pre�o = 1700 * quantidade;
	 }
     
     
     if((tipo == "PS3" || tipo == "Ps3") && cor == "Preto") {
		 
			this.pre�o = 1000 * quantidade;
			 
		 }
		 
	    
	 if((tipo == "PS3" || tipo == "Ps3") && cor == "Branco") {
			 
			this.pre�o = 1200 * quantidade;
			 
		 }
	 
  }
	  
  
  
  public void calcularPre�o(String tipo, String cor, int quantidade, boolean pro) {
	  
	  
		 
		 if((tipo == "PS4" || tipo == "Ps4") && cor == "Preto" && pro == true) {
			 
			 this.pre�o = 2000 * quantidade;
		 }
		 
         if((tipo == "PS4" || tipo == "Ps4") && cor == "Preto" && pro == false) {
			 
			 this.pre�o = 1500 * quantidade;
		 }
		 
		 
	     if((tipo == "PS4" || tipo == "Ps4") && cor == "Branco" && pro == true) {
			 
			 this.pre�o =  2200 * quantidade;
		 }
		 
         if((tipo == "PS4" || tipo == "Ps4") && cor == "Branco" && pro == false) {
			 
			 this.pre�o =  1700 * quantidade;
		 }
  }
	  
  

public String getCor() {
	return cor;
}



public void setCor(String cor) {
	this.cor = cor;
}



public int getQuantidade() {
	return quantidade;
}



public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}



public int getPre�o() {
	return pre�o;
}



}
