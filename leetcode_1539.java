class Solution {
    public int findKthPositive(int[] arr, int k) {
      List<Integer>ls=new ArrayList<>();
      HashMap<Integer,Integer>hm=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        int key=arr[i];
        hm.put(key,hm.getOrDefault(key,0)+1);
      }
      for(int i=1;i<=arr[arr.length-1]+k;i++){
         if(!hm.containsKey(i)){
            ls.add(i);
         }
      }
      if(ls.size()==0){
        return 0;
      }
     
      return ls.get(k-1);
    }
}
