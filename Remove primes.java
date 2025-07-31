import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPrime(Integer num){
        
        if(num <= 1)
            return false;
        
        for(int i=2; i<num; i++){
            
            if(num%i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        
        for(int i=0; i<n; i++){
            
            if(isPrime(arr.get(i)) == false)
                ans.add(arr.get(i));
        }
        
        System.out.print(ans);
    }
}