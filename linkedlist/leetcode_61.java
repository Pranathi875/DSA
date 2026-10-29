class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        List<Integer>ls=new ArrayList<>();
        while(temp!=null){
            ls.add(temp.val);
            temp=temp.next;
        }
        k=k%ls.size();
        int temp1[]=new int[ls.size()-k];
        int temp2[]=new int[k];
        for(int i=0;i<ls.size()-k;i++){
            temp1[i]=ls.get(i);
        }
        int j=0;
        for(int i=ls.size()-k;i<ls.size();i++){
            temp2[j]=ls.get(i);
            j++;
        }
       List<Integer>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(temp2[i]);
            
        }
        for(int i=0;i<ls.size()-k;i++){
            ans.add(temp1[i]);
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int i=0;i<ls.size();i++){
            curr.next=new ListNode(ans.get(i));
            curr=curr.next;
        }
        return dummy.next;
    }
}
