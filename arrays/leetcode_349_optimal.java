class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>ls=new ArrayList<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int i=0,j=0;
       int n1=nums1.length,n2=nums2.length;
       while(i<n1&&j<n2){
           if(nums1[i]==nums2[j]){
            if(ls.size()==0||ls.get(ls.size()-1)!=nums1[i]){
             ls.add(nums1[i]);
             }
             i++;
             j++;
           }
           else if(nums1[i]<nums2[j]){
             i++;
           }
           else{
             j++;
           }
       }
       int ans[]=new int[ls.size()];
       for(int k=0;k<ans.length;k++){
          ans[k]=ls.get(k);
       }
       return ans;
    }
}
