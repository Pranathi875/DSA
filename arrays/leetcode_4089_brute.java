class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       int cnt=0;
       for(int i=0;i<nums.length;i++){
         for(int j=i;j<nums.length;j++){
             ArrayList<Integer>ls=new ArrayList<>();
             ls.clear();
             boolean flag=true;
             for(int k=i;k<=j;k++){
                 ls.add(nums[k]);
             }
             for(int k=0;k<ls.size();k++){
                 if(ls.get(k)<minK||ls.get(k)>maxK){
                     flag=false;
                     break;
                 }
             }
             if(flag){
                 cnt++;
             }
         }
       }
      return cnt;
    }
}
