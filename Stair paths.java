import java.io.*;
import java.util.*;

public class Solution {
    
    static ArrayList<String> ans = new ArrayList<>();
    
    public static void paths(int stair, int n, String p){
        
        if(stair >= n){
            
            if(stair == n)
              ans.add(p);
            
            return;
        }
        
        paths(stair+1, n, p+"1");
        paths(stair+2, n, p+"2");
        paths(stair+3, n, p+"3");
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        paths(0,n, "");
        
        System.out.println(ans);
    }
}