class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<=n;i++){
           int key=i;
           hm.put(key,0);
        }
        for(int i=0;i<n;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(int num:hm.keySet()){
            if(hm.get(num)==0){
                return num;
            }
        }
        return 0;
    }
}
