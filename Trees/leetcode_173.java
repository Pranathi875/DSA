class BSTIterator {
    Stack<TreeNode>st=new Stack<>();
    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }
    public void pushLeft(TreeNode node){
        while(node!=null){
            st.push(node);
            node=node.left;
        }
    }
    
    public int next() {
        TreeNode node=st.pop();
        if(node.right!=null){
           pushLeft(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}
