class Solution {
    public void nextPermutation(int[] nums) {
        
        int piv = -1;
        int n = nums.length;
        
        for(int i=n-2; i>=0; i--){

            if(nums[i] < nums[i+1]){
                piv = i;
                break;
            }
        }

        if(piv != -1){

            int j = n-1;

            while(j > piv){

                if(nums[j] > nums[piv]){
                    break;
                }

                j--;
            }

            int temp = nums[piv];
            nums[piv] = nums[j];
            nums[j] = temp;
        }

        int i = piv+1;
        int j = nums.length-1;

        while(i<j){

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}