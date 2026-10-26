class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long cnt=0;
        long len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=minK&&nums[i]<=maxK){
                len++;
            }
            else{
                len=0;
            }
            cnt+=len;
        }
        return cnt;
    }
}
