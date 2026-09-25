class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        int ans=-1;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>level=new ArrayList<>();
           
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                level.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans=level.get(0);
        }
        return ans;
    }
}
