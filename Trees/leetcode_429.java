class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                level.add(node.val);
                for(Node child:node.children){
                    q.offer(child);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
