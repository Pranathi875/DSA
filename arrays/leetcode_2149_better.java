class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        int j=0,k=1;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                temp[j]=nums[i];
                j+=2;
            }
            else{
                temp[k]=nums[i];
                k+=2;
            }
        }
        return temp;
    }
}
