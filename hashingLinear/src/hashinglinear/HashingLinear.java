
package hashinglinear;

import java.util.Scanner;

public class HashingLinear {

    public static void main(String[] args){
        HashAberto hashing = new HashAberto();
        
        hashing.put(44, 44);
        
        hashing.print();
        
        System.out.println(" ");
        
        hashing.print();
    }
}
