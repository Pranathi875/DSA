class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       int cnt=0;
       for(int i=0;i<nums.length;i++){
         for(int j=i;j<nums.length;j++){
             if(nums[j]<minK||nums[j]>maxK){
                 break;
             }
             cnt++;
         }
       }
      return cnt;
    }
}
