class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum=0;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        List<List<Integer>>result=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();    
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();          
                if(node.left!=null){
                    if(node.left.left==null&&node.left.right==null){
                        sum+=node.left.val;
                    }
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
           
        }
       
        return sum;
    }
}
