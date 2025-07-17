import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int mat[][] = new int[n][n];
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                mat[i][j] = sc.nextInt();
            }
        }
        
        //take the transpose
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //exchange the columns
        int i=0;
        int j=n-1;
        
        while(i<j){
            
            for(int k=0; k<n; k++){
                int temp = mat[k][i];
                mat[k][i] = mat[k][j];
                mat[k][j] = temp;
            }
            
            i++;
            j--;
        }
        
        for(i=0; i<n; i++){
            
            for(j=0; j<n; j++){
                
                System.out.print(mat[i][j] + " ");
                
            }
            
            System.out.println();
        }
    }
}