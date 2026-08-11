class Solution {
    public int singleNonDuplicate(int[] nums) {
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
          int key=nums[i];
          hm.put(key,hm.getOrDefault(key,0)+1);
       }
       for(int num:nums){
        if(hm.get(num)==1){
            return num;
        }
       }
       return -1;
    }
}
