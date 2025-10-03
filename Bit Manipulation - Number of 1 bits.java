class Solution {
    public int reverseBits(int n) {
        
        int ans = 0;

        for(int i=0; i<32; i++){

            if( (n&(1<<i)) > 0){
                
                ans |= (1<<(32-i-1));
            }
        }

        return ans;
    }
}