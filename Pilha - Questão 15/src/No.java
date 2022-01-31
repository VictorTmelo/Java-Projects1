public class No {

	private char x;
	
	private No proximo;

	public No (char x) {
		
		this.x = x;
		
		proximo = null;
		
	}

	
	public char getX() {
		return x;
	}

	public void setX(char x) {
		this.x = x;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}


}