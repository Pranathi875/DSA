class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0,cnt1=0,cnt2=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
            cnt0++;
         }
         else if(nums[i]==1){
            cnt1++;
         }
         else{
            cnt2++;
         }
       }
       int j=0;
       for(j=0;j<cnt0;j++){
          nums[j]=0;
       }
       for(j=cnt0;j<cnt0+cnt1;j++){
        nums[j]=1;
       }
       for(j=cnt0+cnt1;j<cnt0+cnt1+cnt2;j++){
        nums[j]=2;
       }
      
    }
}
