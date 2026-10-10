class Solution {
     static  ArrayList<Integer>ans=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        ans.clear();
        dfs(root);
       int minDiff=Integer.MAX_VALUE;
       //inorder is already in sorted manner
       for(int i=1;i<ans.size();i++){
         minDiff=Math.min(minDiff,Math.abs(ans.get(i)-ans.get(i-1)));
       }
       return minDiff;
        
    }
    public static void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        ans.add(root.val);
        dfs(root.right);
    }
}
