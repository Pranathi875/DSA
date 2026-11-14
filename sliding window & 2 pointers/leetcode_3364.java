class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int left=0;
            int sum=0;
            for(int right=0;right<nums.size();right++){
                sum+=nums.get(right);
                if(right-left+1==i){
                    if(sum>0){
                    min=Math.min(min,sum);
                    }
                    sum-=nums.get(left);
                    left++;
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
