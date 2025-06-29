import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
            arr[i]= sc.nextInt();
        
        int d = sc.nextInt();
        
        int firstIndex = -1;
        int lastIndex = -1;
        
        for(int i=0; i<n; i++){
            
            if(arr[i] == d){
                firstIndex = i;
                break;
            }
        }
        
        for(int i=n-1; i>0; i--){
            
            if(arr[i] == d){
                lastIndex = i;
                break;
            }
        }
        
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        
    }
}