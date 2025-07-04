import java.io.*;
import java.util.*;

public class Solution {
    
    public static void diff(int[] a2, int[] a1){
        
        int n = a2.length;
        
        int res[] = new int[n];
        
        int borrow = 10;
        
        for(int i=n-1; i>=0; i--){
            
            if(a2[i] < a1[i]){
                int dig_diff = a2[i]+borrow - a1[i];
                res[i] = dig_diff;
                
                if(borrow == 10){
                    borrow = 9;
                }
            }
            
            else{
                
                int dig_diff = a2[i]-a1[i];
                
                if(borrow == 9){
                    
                    if(a2[i] > a1[i]){
                    dig_diff -= 1;
                    borrow = 10;
                    }
                    
                    else if(a2[i] == a1[i]){
                        dig_diff += 9;
                    }
                }
                
                res[i] = dig_diff;
            }
        }
        
        int idx = 0;
        
        while(idx < res.length && res[idx] == 0)
            idx++;
        
        if(idx == res.length)
            System.out.println(0);
        
        else{
            
            while(idx < res.length){
                System.out.println(res[idx]);
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        
        for(int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        
        int a3[] = new int[n2];
            
        int d = n2-n1;
            
        for(int i=0; i<n1; i++){
            a3[i+d] = a1[i];
        }
            
        diff(a2, a3);
    }
}