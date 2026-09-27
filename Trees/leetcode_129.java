class Solution {
    public int sumNumbers(TreeNode root) {
        int sum=0;
        Queue<TreeNode>q=new LinkedList<>();
        Queue<Integer>numSum=new LinkedList<>();
        q.offer(root);
        numSum.add(root.val);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int n=numSum.poll();
            if(node.left==null&&node.right==null){
                sum+=n;

            }
            if(node.left!=null){
                q.offer(node.left);
                numSum.offer(n*10+node.left.val);
            }
            if(node.right!=null){
                q.offer(node.right);
                numSum.offer(n*10+node.right.val);
            }
        }
        return sum;
    }
}
