class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
      long sum=0;
      HashMap<Integer,Integer>hm=new HashMap<>();
      List<Integer>ls=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        int key=nums[i];
        hm.put(key,hm.getOrDefault(key,0)+1);
      }
      for(int i=1;i<=nums[nums.length-1]+k;i++){
        if(!hm.containsKey(i)){
            ls.add(i);
        }
      }
      if(ls.size()==0){
        return 0;
      }
      for(int i=0;i<k;i++){
        sum+=ls.get(i);
      }
      return sum;

    }
}
