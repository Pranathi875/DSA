class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int res=digitSum(nums[i]);
            if(res==i){
                return i;
            }
        }
        return -1;
    }
    public static int digitSum(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        return sum;
    }
}
