class Solution {
    public int minMergedInteger(int[] nums) {
       int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            String s1=String.valueOf(nums[i]);
            String s2=String.valueOf(nums[i+1]);
            String res=s1+s2;
            int ans=Integer.parseInt(res);
            min=Math.min(min,ans);
            
        }
        return min;
    }
}
