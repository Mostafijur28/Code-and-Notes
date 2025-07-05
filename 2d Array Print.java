import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int mat[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                
                System.out.print(mat[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}