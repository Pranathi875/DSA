class Solution {
    public void moveZeroes(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            count++;
          }
       }
       int temp[]=new int[nums.length];
       int j=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=0){
            temp[j]=nums[i];
            j++;
         }
       }
       for(int i=0;i<count;i++){
        temp[j]=0;
        j++;
       }
       for(int i=0;i<nums.length;i++){
          nums[i]=temp[i];
       }
    }
}
