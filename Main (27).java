import java.util.*;

public class Main
{
    static final long mod = (long)1e9 + 7;
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		arr[i] = sc.nextInt();
		
		long dp[][] = new long[n][m+1];
		
		if(arr[0] == 0){
		    for(int i=1; i<=m; i++)
		    dp[0][i] = 1L;
		}
		else{
		    dp[0][arr[0]] = 1L;
		}
		
		
		for(int i=1; i<n; i++){
		    
		    if(arr[i] != 0){
		        
		        dp[i][arr[i]] += d[i-1][arr[i]];
		        dp[i][arr[i]] %= mod;
		        
		        if(arr[i]-1 >= 1){
		            dp[i][arr[i]] += d[i-1][arr[i]-1];
		            dp[i][arr[i]] %= mod;
		        }
		        
		        if(arr[i]+1 <= m){
		            dp[i][arr[i]] += d[i-1][arr[i]+1];
		            dp[i][arr[i]]%= mod;
		        }
		    }
		    
		    else{
		        
		    for(int j=1; j<=m; j++){
		        
		        dp[i][j] += d[i-1][j];
		        dp[i][j] %= mod;
		        
		        if(j-1 >= 1){
		            dp[i][j] += d[i-1][j-1];
		            dp[i][j] %= mod;
		        }
		        
		        if(j+1 <= m){
		            dp[i][j] += d[i-1][j+1];
		            dp[i][j] %= mod;
		        }
		    }
		    
		    }
		    
		}
		
		long ans = 0L;
		
		for(int i=1; i<=m; i++){
		    
		    ans += dp[n-1][i];
		    ans %= mod;
		}
		
		System.out.println(ans);
		
	}
}