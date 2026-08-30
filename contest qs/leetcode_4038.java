class Solution {
    public int countSpecialIntegers(int[] nums) {
       int blocks[]=new int[101];
       for(int i=0;i<nums.length;i++){
           if(i==0||nums[i]!=nums[i-1]){
               blocks[nums[i]]++;
           }
       }
        int ans=0;
        for(int i=1;i<=100;i++){
            if(blocks[i]==1){
                ans++;
            }
        }
        return ans;
    }
}
