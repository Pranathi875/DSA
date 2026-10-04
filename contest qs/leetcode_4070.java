class Solution {
    public int minRotations(String s) {
        int diffSum=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int curr=Character.getNumericValue(s.charAt(i));
            int diff=Math.abs(curr-prev);
            diffSum+=Math.min(diff,10-diff);
            prev=curr;
        }
        return diffSum;
    }
}
