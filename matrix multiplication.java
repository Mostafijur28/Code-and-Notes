import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        
        int A[][] = new int[n1][m1];
        
        for(int i=0; i<n1; i++){
            
            for(int j=0; j<m1; j++){
                
                A[i][j] = sc.nextInt();
            }
        }
        
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        
        int B[][] = new int[n2][m2];
        
        for(int i=0; i<n2; i++){
            
            for(int j=0; j<m2; j++){
                
                B[i][j] = sc.nextInt();
            }
        }
        
        if(m1 != n2){
            System.out.println("Invalid input");
        }
        
        else{
            int C[][] = new int[n1][m2];
            
            for(int i=0; i<n1; i++){
                
                for(int j=0; j<m1; j++){
                    
                    for(int k=0; k<m2; k++){
                        
                        C[i][k] += A[i][j]*B[j][k];
                    }
                    
                }
            }
            
            for(int i=0; i<n1; i++){
                
                for(int j=0; j<m2; j++){
                    
                    System.out.print(C[i][j] + " ");
                }
                
                System.out.println();
            }
        }
    }
}