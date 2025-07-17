import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        
        boolean flag = true;
        
        for(int i=0; i<s.length()-1; i++){
            
            if(arr[i] == arr[i+1]){
                flag = false;
                break;
            }
        }
        
        if(flag == true){
            System.out.println("Isogram");
        }
        else{
            System.out.println("Not an Isogram");
        }
    }
}