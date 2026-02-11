class Main {
    public static int isPossible(int []nums,int th,int k){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int rem=nums[i]/k;
            if(nums[i]%k!=0){
                rem++;
            }
            sum+=rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int k=5;
        int th=6;
        int res=isPossible(nums,th,k);
        System.out.println(res);
    }
    
}
