public class Main
{
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6};
		int n = nums.length;
		
		int k = 4;
		
		int copy[] = new int[k];
		
		for(int i=0; i<k; i++)
		copy[i] = nums[i];
		
		//left shift
		for(int i=k; i<n; i++){
		    nums[i-k] = nums[i];
		}
		
		int idx = n-k;
		for(int i=0; i<k; i++){
		    
		    nums[idx] = copy[i];
		    idx++;
		}
		
		for(int num : nums){
		    System.out.print(num + " ");
		}
	}
}