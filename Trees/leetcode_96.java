class Solution {
    public int numTrees(int n) {
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*(2*n-i+1)/i;
        }
        return (int)(ans/(n+1));
    }
}
