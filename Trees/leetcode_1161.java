class Solution {
    public int maxLevelSum(TreeNode root) {
        int ansLevel=0;
        List<List<Integer>>ans=new ArrayList<>();
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
            ans.add(level);
        }
        long maxSum=Long.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            long levelSum=0;
            for(int j=0;j<ans.get(i).size();j++){
                levelSum+=ans.get(i).get(j);
            }
           if(levelSum>maxSum){
              maxSum=levelSum;
              ansLevel=i+1;
           }
        }
        return ansLevel;
    }
}
