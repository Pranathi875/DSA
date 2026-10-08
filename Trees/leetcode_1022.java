class Solution {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
         preorder(root,0);
         return sum;
    }
    public void preorder(TreeNode node,int num){
        if(node==null){
            return;
        }
        num=num*2+node.val;
        if(node.left==null&&node.right==null){
            sum+=num;
        }
        preorder(node.left,num);
        preorder(node.right,num);
    }
}
