class Solution {
    HashMap<Integer,Integer>hm=new HashMap<>();
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    public TreeNode build(int[]preorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootVal=preorder[preIndex++];
        TreeNode root=new TreeNode(rootVal);
        int index=hm.get(rootVal);
        root.left=build(preorder,left,index-1);
        root.right=build(preorder,index+1,right);
        return root;
    }

}
