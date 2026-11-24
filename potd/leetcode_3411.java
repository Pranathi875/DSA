class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int lcm=nums[i];
            int gcd=nums[i];
            long prod=nums[i];
            for(int j=i;j<nums.length;j++){
                if(j>i){
                    prod*=nums[j];
                    gcd=gcd(gcd,nums[j]);
                    lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                }
                if(prod==(long)gcd*lcm){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
