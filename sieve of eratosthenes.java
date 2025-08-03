import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean primes[] = new boolean[n+1];
        Arrays.fill(primes, true);
        
        primes[0] = false;
        primes[1] = false;
        
        for(int p=2; p*p <= n; p++){
            
            if(primes[p] == true){
                
                for(int j=p*p; j<=n; j+= p){
                    
                    primes[j] = false;
                }
            }
        }
        
        for(int i=2; i<=n; i++){
            
            if(primes[i] == true)
                System.out.println(i);
        }
        
        
    }
}