class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long totalSum=0;
        for(int num:beans){
            totalSum+=num;
        }
        long ans=Long.MAX_VALUE;
        long prefix=0;
        for(int i=0;i<beans.length;i++){
            long removeLeft=prefix;
            long removeRight=
            (totalSum-prefix)-(long)beans[i]*(beans.length-i);
            ans=Math.min(ans,removeLeft+removeRight);
            prefix+=beans[i];
        }
        return ans;
    }
}
