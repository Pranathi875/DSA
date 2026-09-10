class Solution {
    int count=0;
    public int averageOfSubtree(TreeNode root) {
      dfs(root);
      return count;
    }
    private int []dfs(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int left[]=dfs(root.left);
        int right[]=dfs(root.right);
        int sum=left[0]+right[0]+root.val;
        int node=left[1]+right[1]+1;
        int average=sum/node;
        if(root.val==average){
            count++;
        }
        return new int[]{sum,node};
    }
}
