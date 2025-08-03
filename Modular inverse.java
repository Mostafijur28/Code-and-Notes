import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BigInteger b1 = BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(m);
        
        BigInteger g = b1.gcd(b2);
        
        //System.out.println(g);
        
        if(g.intValue() != 1){
            System.out.println(-1);
        }
        
        //calculate totient
        
        else{
            
            int t = m;
            int temp = m;
            
            if(temp%2 == 0){
                
                while(temp%2 == 0){
                    temp/=2;
                }
                
                t /= 2;
            }
            
            for(int i=3; i*i <= temp; i+= 2){
                
                if(temp%i == 0){
                    
                    t *= (i-1);
                    t /= i;
                    
                    while(temp%i == 0)
                        temp /= i;
                }
            }
            
            if(temp > 1){
                t *= (temp-1);
                t /= temp;
            }
            
            //n^(t-1)%m calculation
            long pr = n;
            long ans = 1;
            int p = t-1;
            
            while(p > 0){
                
                if(p%2 == 1){
                    ans = ((ans%m)*(pr%m))%m;
                }
                
                pr = ((pr%m)*(pr%m))%m;
                
                p /= 2;
            }
            
            System.out.println(ans);
        }
        
    }
}