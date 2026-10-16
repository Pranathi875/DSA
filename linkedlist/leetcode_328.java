class Solution {
    public ListNode oddEvenList(ListNode head) {
        List<Integer>oddIdx=new ArrayList<>();
        List<Integer>evenIdx=new ArrayList<>();
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            if(cnt%2==0){
                evenIdx.add(temp.val);
            }
            else{
                oddIdx.add(temp.val);
            }
            temp=temp.next;
            cnt++;
        }
        int m=evenIdx.size();
        int n=oddIdx.size();
        ListNode dummy=new ListNode(-1);
        ListNode node=dummy;
        int j=0;
        temp=head;
        for(int i=0;i<m;i++){
           node.next=new ListNode(evenIdx.get(j));
           node=node.next;
           temp=temp.next;
           j++;
        }
        j=0;
        for(int i=0;i<n;i++){
            node.next=new ListNode(oddIdx.get(j));
            node=node.next;
            temp=temp.next;
            j++;
        }
        return dummy.next;
    }
}
