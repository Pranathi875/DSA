class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=(n*(n+1))/2;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return totalSum-(int)sum;
    }
}
