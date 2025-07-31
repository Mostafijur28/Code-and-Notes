import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c1 = "";
        String c2 = "";
        
        for(int i=0; i<s.length(); ){
            
            int count = 1;
            int j=i+1;
            
            while(j<s.length() && s.charAt(j) == s.charAt(i)){
                count++;
                j++;
            }
            
            c1 += s.charAt(i);
            c2 += s.charAt(i);
            
            if(count > 1)
            c2 += count;
            
            i = j;
            
        }
        
        System.out.println(c1);
        System.out.println(c2);
    }
}