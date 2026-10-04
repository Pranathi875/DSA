class Solution {
    int preIndex=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int inorder[]=preorder.clone();
        Arrays.sort(inorder);
        return build(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode build(int []preorder,int []inorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootVal=preorder[preIndex++];
        TreeNode root=new TreeNode(rootVal);
        int index=start;
        while(inorder[index]!=rootVal){
            index++;
        }
        root.left=build(preorder,inorder,start,index-1);
        root.right=build(preorder,inorder,index+1,end);
        return root;
    }
}
