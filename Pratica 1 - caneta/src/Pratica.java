
public class Pratica {

	public static void main(String[] args) {
		
		Caneta p = new Caneta();
		
		p.setModelo("bic");
		p.setCor("azul");
		p.setCarga(80);
		p.setTampada(true);
		p.destampar();
		p.status();
        p.rabiscar(); 
				
        Caneta p2 = new Caneta();
		
		p2.setModelo("bumba");
		p2.setCor("roza");
		p2.setCarga(45);
		p2.tampar();
		p2.status();
        p2.rabiscar(); 
						
		
        
        
        
        
        
	}

}

