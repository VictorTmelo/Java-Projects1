package Model;

public interface Jogo {

    public void status();
    
    public void calcularPre�o(String tipo, int quantidade);
    
    public void setTipo(String tipo);
    
    public String getTipo();
    
    public int getPre�o();
    
    public void setQuantidade(int quantidade);
    
    public int getQuantidade();
	
}
