class Solution {
    public int countDominantElements(int[] nums) {
      if(nums.length==1){
          return 1;
      }
      int count=0;
      if(nums[0]>=nums[1]){
          count++;
      }
      for(int i=1;i<nums.length-1;i++){
          if(2L*nums[i]>=(long)nums[i-1]+nums[i+1]){
              count++;
          }
      }
      if(nums[nums.length-1]>=nums[nums.length-2]){
          count++;
      }
     return count;
    }
}
