class Solution {
    public int minOperations(int[] nums, int x) {
       int totalSum=0;
       for(int i=0;i<nums.length;i++){
         totalSum+=nums[i];
       }
       int remaining=totalSum-x;
       if(remaining<0){
        return -1;
       }
       int l=0;
       int found=0;
       int sum=0;
       int max=0;
       for(int r=0;r<nums.length;r++){
          sum+=nums[r];
          while(sum>remaining){
            sum-=nums[l];
            l++;
          }
          if(sum==remaining){
            found=1;
            max=Math.max(max,r-l+1);
          }
       } 

       if(found==1){
         return nums.length-max;
       }
       return -1;

    }
}
