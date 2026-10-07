class Solution {
    TreeNode dummy=new TreeNode(-1);
    TreeNode prev=dummy;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return dummy.right;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        TreeNode right=root.right;
        root.left=null;
        prev.right=root;
        prev=root;
        inorder(right);
    }
}
