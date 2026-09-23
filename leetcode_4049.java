class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
       HashMap<Integer,List<Integer>>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(!hm.containsKey(nums[i])){
               hm.put(nums[i],new ArrayList<>());
           }
            hm.get(nums[i]).add(i);
        }
        
        for(int num:hm.keySet()){
            List<Integer>list=hm.get(num);
            if(list.size()<3)
               continue;
            int firstDiff=list.get(1)-list.get(0);
            int flag=0;
            for(int i=2;i<list.size();i++){
                int diff=list.get(i)-list.get(i-1);
                if(diff!=firstDiff){
                    flag=1;
                    break;
                }
               
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}
