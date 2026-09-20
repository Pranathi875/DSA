class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         int key=nums[i];
         hm.put(key,hm.getOrDefault(key,0)+1);
       }
       for(int ele:hm.keySet()){
         if(hm.get(ele)>n/2){
            return ele;
         }
       }
       return -1;
    }
}
