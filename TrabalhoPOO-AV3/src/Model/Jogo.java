package Model;

public interface Jogo {

    public void status();
    
    public void calcularPreço(String tipo, int quantidade);
    
    public void setTipo(String tipo);
    
    public String getTipo();
    
    public int getPreço();
    
    public void setQuantidade(int quantidade);
    
    public int getQuantidade();
	
}
