class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null){
        return list2;
    }
    if(list2==null){
        return list1;
    }
    ListNode dummy=new ListNode(-1);
    ListNode temp=dummy;
    while(list1!=null&&list2!=null){
        if(list1.val<=list2.val){
             temp.next=list1;
             list1=list1.next;
             temp=temp.next;
        } 
        else{
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
    }
    while(list1!=null){
         temp.next=list1;
         temp=temp.next;
         list1=list1.next;
        
    }
    while(list2!=null){
        temp.next=list2;
        temp=temp.next;
        list2=list2.next;
    }
    return dummy.next;
}
}
