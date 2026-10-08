class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        ArrayList<Integer>ls=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                ls.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size();j++){
                int sum=ls.get(i)+ls.get(j);
                if(sum==k){
                    return true;
                }
            }
        }
        return false;
    }
}
