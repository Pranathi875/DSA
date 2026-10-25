class Solution {
    HashSet<Integer>hs=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return false;
        }
        dfs(root);
        if(hs.size()==1){
            return true;
        }
        return false;
    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        hs.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
