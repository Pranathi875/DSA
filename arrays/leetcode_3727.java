class Solution {
    public long maxAlternatingSum(int[] nums) {
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i]*nums[i];
        }
        Arrays.sort(temp);
        long sum=0;
        for(int i=0;i<temp.length/2;i++){
           sum-=temp[i];
        }
        for(int i=temp.length/2;i<temp.length;i++){
            sum+=temp[i];
        }
        return sum;
    }
}
