class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
       for(int i=0;i<nums.size();i++){ 
        for(int j=i;j<nums.size();j++){
           HashMap<Integer,Integer>hm=new HashMap<>();
           int count=0;
           for(int k=i;k<=j;k++){
              int key=nums.get(k);
              hm.put(key,hm.getOrDefault(key,0)+1);
           }
           
           sum=sum+(hm.size()*hm.size());
        }
       }  
       return sum;
    }
}
