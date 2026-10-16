class Solution {
    public TreeNode sortedListToBST(ListNode head) {
      List<Integer>ls=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
          ls.add(temp.val);
          temp=temp.next;
       }
       return build(ls,0,ls.size()-1);
    }
    public TreeNode build(List<Integer>ls,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(ls.get(mid));
        node.left=build(ls,left,mid-1);
        node.right=build(ls,mid+1,right);
        return node;
    }
}
