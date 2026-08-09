class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount=0;
        int l=0;
        int maxLen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeroCount++;
            }
            while(zeroCount>1){
             if(nums[l]==0){
              zeroCount--;}
              l++;
            }
             maxLen=Math.max(maxLen,r-l);
        }
        return maxLen;
    }
}
