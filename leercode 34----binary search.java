class Solution {
    public int[] searchRange(int[] nums, int target) {
       int arr[]=new int[2];
       arr[0]=leftBin(nums,target);
       arr[1]=rightBin(nums,target);
       return arr;
    }
    public static int leftBin(int nums[],int k){
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
          int mid=low+(high-low)/2;
          if(nums[mid]==k){
            ans=mid;
            high=mid-1;
          }
          else if(nums[mid]>k){
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return ans;
        
    }
    public static int rightBin(int nums[],int k){
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
       
    }

}
