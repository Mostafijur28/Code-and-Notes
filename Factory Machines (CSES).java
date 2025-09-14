import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long k = sc.nextInt();
		
		long arr[] = new long[n];
		
		long max = 0;
		
		for(int i=0; i<n; i++){
		arr[i] = sc.nextLong();
		max = Math.max(max, arr[i]);
		}
		
		long st = 1;
		long en = max*k;
		
		long ans = en;
		
		while(st <= en){
		    
		    long mid = st + (en-st)/2;
		    
		    long count = 0;
		    
		    for(int i=0; i<n; i++){
		        count += mid/arr[i];
		        
		        if(count >= k)
		        break;
		    }
		    
		    if(count >= k){
		        ans = mid;
		        en = mid-1;
		    }
		    
		    else{
		        st = mid+1;
		    }
		    
		}
		
		System.out.println(ans);
		
	}
}