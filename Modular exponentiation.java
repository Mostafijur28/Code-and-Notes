import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long prod = 1;
        long pow = x;
        
        while(n > 0){
            
            if(n%2 == 1){
                prod = ((prod%m)*(pow%m))%m;
            }
            
            pow = ((pow%m)*(pow%m))%m;
            
            n /= 2;
        }
        
        System.out.println(prod);
    }
}