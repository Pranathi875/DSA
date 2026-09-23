class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer>ls=new ArrayList<>();
           
            if(!hs.contains(nums[i])){
                 hs.add(nums[i]);
            ls.add(i);
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ls.add(j);
                }
            }
            int n=ls.size();
            if(n==3){
                if((ls.get(2)-ls.get(1))==(ls.get(1)-ls.get(0))){
                    count++;
                }
            }}
        }
        return count;
    }
}
