class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int key=nums1[i];
            hm1.put(key,hm1.getOrDefault(key,0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            int key=nums2[i];
            hm2.put(key,hm2.getOrDefault(key,0)+1);
        }
        for(int num:hm1.keySet()){
            if(hm2.containsKey(num)){
                ls.add(num);
            }
        }
       
       int ans[]=new int[ls.size()];
       for(int i=0;i<ans.length;i++){
         ans[i]=ls.get(i);
       }
       return ans;
    }
}
