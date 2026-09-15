##1--optimal
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
##2--more optimal using xor

class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
       for(int i=0;i<=nums.length;i++){
            xor1^=i;
       }
       for(int i=0;i<nums.length;i++){
            xor2^=nums[i];
       }
       return xor1^xor2;
    }
}
