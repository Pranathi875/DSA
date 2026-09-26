class Solution {
    public boolean isCompleteTree(TreeNode root) {
        boolean nullFound=false;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node==null){
                    nullFound=true;
                }
                else{
                    if(nullFound){
                        return false;
                    }
                    q.offer(node.left);
                    q.offer(node.right);
                }
        
            }
        }
        return true;
    }
}
