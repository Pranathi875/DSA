class Solution {
    public static void markParents(TreeNode root,HashMap<TreeNode,TreeNode>parent){
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.left!=null){
                q.offer(node.left);
                parent.put(node.left,node);
            }
            if(node.right!=null){
                q.offer(node.right);
                parent.put(node.right,node);
            }
        }
    }
    public TreeNode findStart(TreeNode root,int start){
        if(root.val==start){
            return root;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.val==start){
                return node;
            }
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }
        return null;
    }
    public int amountOfTime(TreeNode root, int start) {
        int time=0;
        HashMap<TreeNode,TreeNode>parent=new HashMap<>();
        markParents(root,parent);
        TreeNode startNode=findStart(root,start);
        Queue<TreeNode>q=new LinkedList<>();
        Set<TreeNode>visited=new HashSet<>();
        q.offer(startNode);
        visited.add(startNode);
        while(!q.isEmpty()){
            int size=q.size();
             boolean burned=false;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();              
                 if(node.left!=null&&!visited.contains(node.left)){
                     visited.add(node.left);
                     q.offer(node.left);
                     burned=true;
                 }
                 if(node.right!=null&&!visited.contains(node.right)){
                    visited.add(node.right);
                    q.offer(node.right);
                    burned=true;
                 }
                 if(parent.containsKey(node)&&!visited.contains(parent.get(node))){
                    visited.add(parent.get(node));
                    q.offer(parent.get(node));
                    burned=true;
                 }
            }
            if(burned){
                time++;
            }
        }
        return time;
    }
}
