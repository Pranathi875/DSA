class Solution {
    List<Integer>ls=new ArrayList<>();
    public int findSecondMinimumValue(TreeNode root) {
       ls.clear();
        if(root==null){
            return -1;
        }
        preOrder(root);
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)<min){
                secondMin=min;
                min=ls.get(i);
                
            }
            else if((ls.get(i)<secondMin||!found)&&(ls.get(i)!=min)){
                secondMin=ls.get(i);
                found=true;
            }
        }
        if(!found){
            return -1;
        }
        return secondMin;

    }
    public void preOrder(TreeNode root){
         if(root==null){
            return;
         }
         ls.add(root.val);
         preOrder(root.left);
         preOrder(root.right);
    }
}
