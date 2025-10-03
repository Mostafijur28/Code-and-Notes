import java.io.*;
import java.util.*;

public class Solution {
    
    static ArrayList<String> ans = new ArrayList<>();
    
    public static void paths(int r, int c, int n, int m, String p){
        
        if(r == n-1 && c == m-1){
            ans.add(p);
            return;
        }
        
        if(r>=n || c>=m){
            return;
        }
        
        paths(r,c+1,n,m, p+"h");
        paths(r+1,c,n,m, p+"v");
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        paths(0,0,n,m,"");
        
        System.out.println(ans);
    }
}