class Solution {
    public ListNode removeNodes(ListNode head) {
        List<Integer>ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ls.add(temp.val);
            temp=temp.next;
           
        }
        int mark[]=new int[ls.size()];
        for(int i=0;i<mark.length;i++){
            mark[i]=0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=ls.size()-1;i>=0;i--){
            if(ls.get(i)<max){
                mark[i]=1;
            }
            else{
                max=ls.get(i);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        for(int i=0;i<mark.length;i++){
            if(mark[i]==0){
               current.next=new ListNode(ls.get(i));
               current=current.next;

            }
        }
        return dummy.next;
        
    }
}
