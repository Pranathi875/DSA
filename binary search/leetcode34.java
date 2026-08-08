class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        arr[0]=func1(nums,target);
        arr[1]=func2(nums,target);
        if (arr[0] > arr[1]) {
           return new int[]{-1, -1};
           }
        return arr;

    }
    public static int func1(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
               high=mid-1;
            else if(nums[mid]>target)
               high=mid-1;
            else 
               low=mid+1;
        }
        return low;
    }
     public static int func2(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
               low=mid+1;
            else if(nums[mid]>target)
               high=mid-1;
            else 
               low=mid+1;
        }
        return high;
    }

}
