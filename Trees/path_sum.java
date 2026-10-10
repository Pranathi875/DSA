class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       boolean res= dfs(root,targetSum,0);
       return res;
    }
    public static boolean dfs(TreeNode root,int targetSum,int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                return true;
            }
            return false;
        }
      
       return dfs(root.left,targetSum,sum)|| dfs(root.right,targetSum,sum);
       
       
    }
}
