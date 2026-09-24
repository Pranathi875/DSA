class Solution {
    class Pair{
        TreeNode node;
        long index;
        Pair(TreeNode node,long index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int maxWidth=0;
        while(!q.isEmpty()){
            int size=q.size();
            long first=q.peek().index;
            long last=first;
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                long index=p.index;
                last=index;
                if(node.left!=null){
                    q.add(new Pair(node.left,2*index+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,2*index+2));
                }
            }
            int width=(int)(last-first)+1;
            maxWidth=Math.max(width,maxWidth);
        }
        return maxWidth;
    }
}
