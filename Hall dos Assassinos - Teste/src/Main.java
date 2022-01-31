import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static class No {

		private String nome;
		private int kills;
		private No filho1;
		private No filho2;

		public No(String n, int k) {

			this.nome = n;

			this.kills = k;

			filho1 = null;

			filho2 = null;

		}

		public void add(String nome) {

			if (nome.compareTo(this.nome) == 0) {

				kills++;

			} else if (nome.compareTo(this.nome) < 0) {

				if (filho1 == null) {

					filho1 = new No(nome, 0);
					filho1.setKills(1);

				} else {

					filho1.add(nome);

				}

			} else if (nome.compareTo(this.nome) > 0) {

				if (filho2 == null) {

					filho2 = new No(nome, 0);
					filho2.setKills(1);

				} else {

					filho2.add(nome);

				}

			}

		}

		public void remover(String nome, No n) {

			if (nome.compareTo(this.nome) < 0) {

				if (filho1 != null) {

					filho1.remover(nome, this);

				}

				else {

					

				}

			} else if (nome.compareTo(this.nome) > 0) {

				if (filho2 != null) {

					filho2.remover(nome, this);

				}

				else {

					

				}

			} else {

				if (filho1 != null && filho2 != null) {

					this.nome = filho2.minValue();

					filho2.remover(this.nome, this);

				} else if (n.filho1 == this) {

					n.filho1 = ((filho1 != null) ? filho1 : filho2);

				} else if (n.filho2 == this) {

					n.filho2 = ((filho1 != null) ? filho1 : filho2);

				}

			}

		}

		public String minValue() {

			if (filho1 == null)

				return nome;

			else

				return filho1.minValue();

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getKills() {
			return kills;
		}

		public void setKills(int kills) {
			this.kills = kills;
		}

		public No getFilho1() {
			return filho1;
		}

		public void setFilho1(No filho1) {
			this.filho1 = filho1;
		}

		public No getFilho2() {
			return filho2;
		}

		public void setFilho2(No filho2) {
			this.filho2 = filho2;
		}

	}

	public static class Tree {

		private No raiz;
		private int contador;

		public Tree() {

			raiz = null;

			contador = 0;

		}

		public void adicionar(String nome) {

			if (raiz == null) {

				raiz = new No(nome, 1);

			} else {

				raiz.add(nome);

			}

		}

		public void preOrdem(No n) {

			System.out.print(n.getNome() + " " + n.getKills());

			if (n.getFilho1() != null) {

				preOrdem(n.getFilho1());

			}

			if (n.getFilho2() != null) {

				preOrdem(n.getFilho2());

			}

		}

		public void emOrdem(No n) {

			if(raiz != null) {

				if (n.getFilho1() != null) {

					emOrdem(n.getFilho1());

				}

				System.out.println(n.getNome() + " " + n.getKills());

				if (n.getFilho2() != null) {

					emOrdem(n.getFilho2());

				}
				
			  }

			}
		

		public void posOrdem(No n) {

			if (n.getFilho1() != null) {

				posOrdem(n.getFilho1());

			}

			if (n.getFilho2() != null) {

				posOrdem(n.getFilho2());

			}

			System.out.print(n.getNome() + " " + n.getKills());

		}

		public void remover(String nome) {

			if (raiz == null) {

			} else {

				if (raiz.getNome() == nome) {

					No aux = new No("", 0);

					aux.setFilho1(raiz);

					raiz.remover(nome, aux);

					raiz = aux.getFilho1();

				} else {

					raiz.remover(nome, null);

				}

			}

		}
		

		public No getRaiz() {
			return raiz;
		}

		public void setRaiz(No raiz) {
			this.raiz = raiz;
		}

		public int getContador() {
			return contador;
		}

		public void setContador(int contador) {
			this.contador = contador;
		}

	}

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		Tree arvore = new Tree();

		LinkedList<String> mortos = new LinkedList<String>();

		while (true) {

			String nomes = in.readLine();

			if (nomes.equals("")) {

				break;
			}

			String[] frase = nomes.split(" ");

			String nome = frase[0];

			arvore.adicionar(nome);

			mortos.add(frase[1]);

		}

		for (int i = 0; i < mortos.size(); i++) {

			arvore.remover(mortos.get(i));

		}

		System.out.println("HALL OF MURDERERS");
	
		arvore.emOrdem(arvore.getRaiz());
	

	}

}
