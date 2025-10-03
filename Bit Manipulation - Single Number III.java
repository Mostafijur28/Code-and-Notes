class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor = 0;
        
        for(int i=0; i<nums.length; i++)
        xor ^= nums[i];
        
        System.out.println(xor);

        int b = (xor&(-xor));

        System.out.println(b);
        
        int g1 = 0;
        int g2 = 0;

        for(int i=0; i<nums.length; i++){

            if((nums[i]&(b)) != 0)
            g1 ^= nums[i];
            else
            g2 ^= nums[i];
        }

        int ans[] = new int[2];
        ans[0] = g1;
        ans[1] = g2;

        return ans;
    }
}