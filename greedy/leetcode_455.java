class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        int m=g.length;
        int n=s.length;
        while(l<m&&r<n){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}
