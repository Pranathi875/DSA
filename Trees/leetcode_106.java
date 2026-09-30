class Solution {
    HashMap<Integer,Integer>hm=new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return build(postorder,0,postorder.length-1);
    }
    public TreeNode build(int []postorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootVal=postorder[postIndex--];
        TreeNode root=new TreeNode(rootVal);
        int index=hm.get(rootVal);
        root.right=build(postorder,index+1,right);
        root.left=build(postorder,left,index-1);
     return root;
    }
}
