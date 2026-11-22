class Solution {
    public long minCost(int[] nums) {
       int n=nums.length;
        long ans=Long.MAX_VALUE;
        int i=0;
        while(i<n){
            int j=i;
            while(j+1<n&&nums[j]==nums[j+1]){
                j++;
            }
            if(i<=n-2&&j>=1){
                long cost=(long)nums[i]*(i+n-1-j);
                ans=Math.min(ans,cost);
            }
            i=j+1;
        }
        return ans;
    }
}
