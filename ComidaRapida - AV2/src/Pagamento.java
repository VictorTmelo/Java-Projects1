
public class Pagamento {

	private int tipo;
	private int num;
	private int conta;
	private int agencia;
	private String banco;
	
public void status() {
		
		if(tipo == 1){
			System.out.println("|Forma de pagamento: Dinheiro.           |");
			System.out.println("|Pagamento realizado com sucesso!!       |");
		}
		if(tipo == 2){
			System.out.println("|Forma de pagamento: Cheque.             |");
			System.out.println("|N�mero do cheque: " + getNum() + "      |");
			System.out.println("|N�mero da conta: " + getConta() + "     |");
			System.out.println("|N�mero da ag�ncia: " + getAgencia() + " |");
			System.out.println("|Banco: " + getBanco() + "               |");
		}
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
