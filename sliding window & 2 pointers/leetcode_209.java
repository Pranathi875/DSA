class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minLen=Integer.MAX_VALUE;
      int sum=0;
      int l=0;
      for(int r=0;r<nums.length;r++){
          sum+=nums[r];
          while(sum>=target){
             minLen=Math.min(minLen,r-l+1);
             sum-=nums[l];
             l++;
          }
      }
      if(minLen==Integer.MAX_VALUE){
        return 0;
      }
      return minLen;
    }
}
