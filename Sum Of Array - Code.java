import java.io.*;
import java.util.*;

public class Solution {
    
    public static void sum(int a1[], int a2[]){
        
        int res[] = new int[a1.length + 1];
        int idx = res.length-1;
        int c = 0;
        
        for(int i=a1.length-1; i>=0; i--){
            
            int dig_sum = a1[i] + a2[i] + c;
            res[idx] = dig_sum%10;
            
            c = dig_sum/10;
            idx--;
        }
        
        if(c > 0)
            res[idx] = c;
        
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
        
        
        if(n1 < n2){
            
            int a3[] = new int[n2];
            
            int d = n2-n1;
            
            for(int i=0; i<n1; i++){
                a3[i+d] = a1[i];
            }
            
            sum(a3, a2);
        }
        
        else{
            
            int a3[] = new int[n1];
            
            int d = n1-n2;
            
            for(int i=0; i<n2; i++){
                a3[i+d] = a2[i];
            }
            
            sum(a3, a1);
        }
        
    }
}