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
        
        int r1=0;
        int r2=n-1;
        
        int c1=0;
        int c2=m-1;
        
        while(r1<=r2 && c1<=c2){
            
            //print all c1 from r1 till r1
            for(int i=r1; i<=r2; i++){
                System.out.println(mat[i][c1]);
            }
            
            c1++;
            
            if(c1 > c2)
                break;
            
            //print all r2 from c1 till c2
            for(int i=c1; i<=c2; i++){
                System.out.println(mat[r2][i]);
            }
            
            r2--;
            if(r1 > r2)
                break;
            
            //print all c2 from r2 till r1
            for(int i=r2; i>=r1; i--){
                System.out.println(mat[i][c2]);
            }
            
            c2--;
            if(c1 > c2)
                break;
            
            //print all r1 from c2 till c1
            for(int i=c2; i>=c1; i--){
                System.out.println(mat[r1][i]);
            }
            r1++;
            
        }
    }
}