class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
        inorder(root1,ls1);
        inorder(root2,ls2);
        if(ls1.size()!=ls2.size()){
            return false;
        }
        
        for(int i=0;i<ls1.size();i++){
            if(!ls1.get(i).equals(ls2.get(i))){
                return false;
            }
        }
        return true;
    }
    public List<Integer> inorder(TreeNode root,List<Integer>ls){
        if(root==null){
            return ls;
        }
        if(root.left==null&&root.right==null){
            ls.add(root.val);
        }
        inorder(root.left,ls);
        inorder(root.right,ls);
        return ls;
    }
}
