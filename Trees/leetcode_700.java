class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null&&root.val!=val){
            root=root.val<val?root.right:root.left;
        }
        return root;
    }
}
