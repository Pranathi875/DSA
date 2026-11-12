class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max1=1,max2=1;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    count++;
                    max1=Math.max(max1,count);
                }
                else{
                    count=1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    count++;
                    max2=Math.max(max2,count);
                }
                else{
                    count=1;
                }
            }
        }
        return Math.max(max1,max2);
    }
}
