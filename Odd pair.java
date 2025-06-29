import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                if((arr[i] + arr[j])%2 == 1){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}