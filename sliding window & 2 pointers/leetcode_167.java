class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]={-1,-1};
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
               arr[0]=i+1;
               arr[1]=j+1;
               return arr;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
