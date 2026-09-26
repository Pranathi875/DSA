class Solution {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int lh = leftHeight(root);
        int rh = rightHeight(root);

        if (lh == rh)
            return (1 << lh) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int leftHeight(TreeNode root) {
        int h = 0;

        while (root != null) {
            h++;
            root = root.left;
        }

        return h;
    }

    public int rightHeight(TreeNode root) {
        int h = 0;

        while (root != null) {
            h++;
            root = root.right;
        }

        return h;
    }
}
