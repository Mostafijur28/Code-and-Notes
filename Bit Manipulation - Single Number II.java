class Solution {
    public int singleNumber(int[] nums) {
        
        int bit[] = new int[32];

        for(int i=0; i<nums.length; i++){

            int num = nums[i];

            for(int j=0; j<32; j++){

                if((num&(1<<j)) != 0)
                bit[j]++;
            }
        }

        int ans = 0;

        for(int i=0; i<32; i++){
            if(bit[i]%3 == 1)
            ans |= (1<<i);
        }

        return ans;
        
    }
}