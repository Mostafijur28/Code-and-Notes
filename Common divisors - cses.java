import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		    
		    if(max < arr[i])
		    max = arr[i];
		}
		
		int freq[] = new int[max+1];
		
		for(int i=0; i<n; i++){
		    int e = arr[i];
		    freq[e]++;
		}
		
		int ans = 1;
		
		for(int i=max; i>=2; i--){
		    
		    int count = 0;
		    
		    for(int j=i; j<= max; j += i){
		        count += freq[j];
		    }
		    
		    if(count > 1){
		        ans = i;
		        break;
		    }
		}
		
		System.out.println(ans);
		
	}
}