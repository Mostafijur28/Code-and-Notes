import java.util.Scanner;
import java.util.Arrays;


public class Main
{
    static final long mod = (long)1e9+7;
    
    // public static long num_of_ways(int n, long dp[]){
        
    //     if(n==0)
    //     return 1L;
        
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }
        
    //     long ways = 0L;
        
    //     for(int i=1; i<=6; i++){
            
    //         if(i <= n)
    //         ways = (ways%mod + num_of_ways(n-i, dp)%mod)%mod;
    //     }
        
    //     return dp[n] = ways;
    // }
    
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long dp[] = new long[n+1];
		
		//Arrays.fill(dp, -1);
		
		dp[0] = 1L;
		
		for(int i=1; i<=n; i++){
		    
		    for(int j=1; j<=6; j++){
		        
		        if(j <= i){
		            
		            dp[i] = (dp[i]%mod + dp[i-j]%mod)%mod;
		        }
		    }
		}
		
		System.out.println(dp[n]);
		
	}
}