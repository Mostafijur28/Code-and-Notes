import java.util.*;

public class MyClass {
  public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
      
    // int arr[] = {1,2,3,4}; 
    
    // int n = arr.length;
    
    // for(int i=0; i<n; i++){
        
    //     System.out.println(arr[i]);
    // }
    
    // int[] a = new int[5];
    
    // System.out.println(a);
    
    // for(int i=0; i<a.length; i++){
        
    //     a[i] = sc.nextInt();
    // }
    
    // for(int i=0; i<a.length; i++){
        
    //     System.out.print(a[i] + " ");
    // }
    
// --- mid elements ----

    int n = sc.nextInt();
    
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++)
    arr[i] = sc.nextInt();
    
    // if(n%2 == 1){
    //     System.out.println(arr[n/2]);
    // }
    // else{
    //     System.out.println(arr[n/2 - 1] + " " + arr[n/2]);
    // }
    
// --- array reversal ---

    int i=0; 
    int j = n-1;
    
    // while( i < j ){
        
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
        
    //     i++;
    //     j--;
    // }
    
    // for(int num : arr){
    //     System.out.print(num + " ");
    // }
    
    while( i <= j ){
        
        System.out.println(arr[i] + " ");
        
        if(i != j)
        System.out.println(arr[j] + " ");
        
        i++;
        j--;
    }
    
    
    
    
  }
}