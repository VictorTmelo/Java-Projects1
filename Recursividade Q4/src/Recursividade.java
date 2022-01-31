
public class Recursividade {
	
	public double fazer(double x, double d, double z) {
		
		if(Math.abs(d*d - x) <= z) {
			
			return d;
			
		}else {
			
			return fazer(x,(d*d + x) / (d+d), z);
			
		}
	
	}
	
	

	public static void main(String[] args) {
		
		Recursividade r = new Recursividade();
		
		System.out.println(r.fazer(13, 3.2, 0.001));
		
	}

}
