lass Solution {
    class Pair{
            TreeNode node;
            int col;
            int row;
            Pair(TreeNode node,int col,int row){
                this.node=node;
                this.row=row;
                this.col=col;
            }
        }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Pair>list=new ArrayList<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            list.add(p);
            if(p.node.left!=null){
                q.add(new Pair(p.node.left,p.col-1,p.row+1));
            }
            if(p.node.right!=null){
                q.add(new Pair(p.node.right,p.col+1,p.row+1));
            }
        }
        Collections.sort(list,(a,b)->{
            if(a.col!=b.col)
               return a.col-b.col;
            if(a.row!=b.row)
               return a.row-b.row;
            return a.node.val-b.node.val;
        });
        List<List<Integer>>ans=new ArrayList<>();
        int prevCol=Integer.MIN_VALUE;
        for(Pair p:list){
            if(p.col!=prevCol){
                ans.add(new ArrayList<>());
                prevCol=p.col;
            }
            ans.get(ans.size()-1).add(p.node.val);
        }
      return ans;
    }
}
