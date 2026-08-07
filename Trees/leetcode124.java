class Solution {
      int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;

    }
    public  int dfs(TreeNode root){
       if(root==null){
        return 0;
       }
      int left=Math.max(0,dfs(root.left));
      int right=Math.max(0,dfs(root.right));
      int currentPath=left+right+root.val;

       maxSum = Math.max(maxSum, currentPath);
      return root.val+Math.max(left,right);
    }
}
