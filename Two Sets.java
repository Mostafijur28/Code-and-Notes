import java.util.*;

public class Main
{
    public static long ans = 10000000000L;
    
    public static void minDiff(int idx, long setSum, long arrSum, int nums[]){
        
        if(idx == nums.length){
            ans = Math.min(ans, Math.abs(2*setSum - arrSum));
            return;
        }
        
        //exclusion
        minDiff(idx+1, setSum, arrSum, nums);
        
        //inclusion
        minDiff(idx+1, setSum+nums[idx], arrSum, nums);
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nums[] = new int[n];
		long arrSum = 0L;
		
		for(int i=0; i<n; i++){
		nums[i] = sc.nextInt();
		arrSum += nums[i];
		}
		
		minDiff(0, 0L, arrSum, nums);
		
		System.out.println(ans);
		
	}
}
