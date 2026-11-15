class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            int ansSum=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                ansSum&=nums[j];
                if(ansSum==min){
                    count++;
                }
            }
        }
        return count;
    }
}
