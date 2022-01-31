
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Pareamento {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("src/Base de Dengue1.csv"));
		int cont = 0;
		
		List<Pessoa> arquivo1 = new ArrayList<Pessoa>();
		
		while (br.ready()) {
			
			String linha = br.readLine();
			
			if(cont >0) { 			
				String x[] = linha.split(";");
				
				Pessoa p = new Pessoa();
				
				p.setId(x[0]);
				p.setNome(x[1]);
				p.setPai(x[2]);
				p.setMae(x[3]);
				p.setSexo(x[4]);
								
				arquivo1.add(p);
				
			}	
			cont++;
		}
		
		br.close();
		
		br = new BufferedReader(new FileReader("src/Base de Onibus1.csv"));

		cont = 0;
		
		List<Pessoa> arquivo2 = new ArrayList<Pessoa>();
		
		while (br.ready()) {
			
			String linha = br.readLine();
			
			if(cont >0) { 			
				String x[] = linha.split(";");
				
				Pessoa p = new Pessoa();
				
				p.setId(x[0]);
				p.setNome(x[1]);
				p.setPai(x[2]);
				p.setMae(x[3]);
				p.setSexo(x[4]);			
				
				
				arquivo2.add(p);
				
				
				
			}	
			cont++;
		}
		
		br.close();
		
		for (Pessoa p1 : arquivo1) {
			
			String maiorScoreId = "";
			
			double maxScore = 0;
			
			for (Pessoa p2 : arquivo2) {
				
				double score = distance(p1.getBloco(), p2.getBloco());
				
				if(score>maxScore) {
					maxScore = score;
					maiorScoreId = p2.getId();
				}				
				
			}
			
			p1.setScore(maxScore);
			p1.setIdExterno(maiorScoreId);
			
		}
		
		for (Pessoa p : arquivo1) {
			if(p.getScore() >=0.8) {
				System.out.println(p.getId()+";"+p.getNome()+";"+p.getPai()+";"+p.getMae()+";"+p.getSexo()+";"+p.getScore()+";"+p.getIdExterno());
			}
		}
		
	}
	
	 public static double distance(String s, String t) {
	        int s_len = s.length();
	        int t_len = t.length();
	  
	        if (s_len == 0 && t_len == 0) return 1;
	  
	        int match_distance = Integer.max(s_len, t_len) / 2 - 1;
	  
	        boolean[] s_matches = new boolean[s_len];
	        boolean[] t_matches = new boolean[t_len];
	 
	        int matches = 0;
	        int transpositions = 0;
	 
	        for (int i = 0; i < s_len; i++) {
	            int start = Integer.max(0, i - match_distance);
	            int end = Integer.min(i + match_distance + 1, t_len);
	 
	            for (int j = start; j < end; j++) {
	                if (t_matches[j])
	                    continue;
	                if (s.charAt(i) != t.charAt(j))
	                    continue;
	                s_matches[i] = true;
	                t_matches[j] = true;
	                matches++;
	                break;
	            }
	        }
	 
	        if (matches == 0)
	            return 0;
	 
	        int k = 0;
	        for (int i = 0; i < s_len; i++) {
	            if (!s_matches[i])
	                continue;
	            while (!t_matches[k])
	                k++;
	            if (s.charAt(i) != t.charAt(k))
	                transpositions++;
	            k++;
	        }
	 
	        return (((double) matches / s_len) + ((double) matches / t_len)
	                + (((double) matches - transpositions / 2.0) / matches)) / 3.0;
	    }
		
}

class Pessoa{
	
	private String id;
	
	private String nome;
	
	private String pai;
	
	private String mae;
	
	private String sexo;
	
	private double score;
	
	private String idExterno;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		
		this.sexo = sexo.toUpperCase();
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getIdExterno() {
		return idExterno;
	}

	public void setIdExterno(String idExterno) {
		this.idExterno = idExterno;
	}	
	
	public String getBloco() {
		return nome+pai+mae+sexo;
	}
	
}