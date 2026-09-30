class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int d=0;
        int ans[]=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                d++;
                ans[i]=d%2;

            }
            else{          
                ans[i]=d%2;
                d--;
            }          
        }
        return ans;
    }
}
