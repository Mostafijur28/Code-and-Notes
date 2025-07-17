import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isSafe(int r, int c, int n, int mat[][]){
        
        //row
        for(int i=0; i<n; i++){
            
            if(i == c)
                continue;
            
            if(mat[r][i] == 1)
                return false;
        }
        
        //column
        for(int i=0; i<n; i++){
            
            if(i == r)
                continue;
            
            if(mat[i][c] == 1)
                return false;
        }
        
        //upper left diagonal
        for(int i=r-1,j=c-1; i>=0&&j>=0; i--,j--){
            
            if(mat[i][j] == 1)
                return false;
        }
        
        
        //upper right diagonal
        for(int i=r-1,j=c+1; i>=0&&j<n; i--,j++){
            
            if(mat[i][j] == 1)
                return false;
        }
        
        //lower left diagonal
        for(int i=r+1,j=c-1; i<n&&j>=0; i++,j--){
            
            if(mat[i][j] == 1)
                return false;
        }
        
        //lower right diagonal
        for(int i=r+1,j=c+1; i<n&&j<n; i++,j++){
            
            if(mat[i][j] == 1)
                return false;
        }
        
        return true;
        
    }
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
        
        boolean flag = true;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                if(mat[i][j] == 1){
                    
                    if( isSafe(i,j,n,mat) == false){
                        flag = false;
                    }
                }
            }
        }
        
        if(flag == true){
            System.out.println("N Queens");
        }
        else{
            System.out.println("Danger");
        }
    }
}