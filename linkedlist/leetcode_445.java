import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     StringBuilder sb1=new StringBuilder();
     StringBuilder sb2=new StringBuilder();
     ListNode temp1=l1;
     ListNode temp2=l2;
     while(temp1!=null){
        sb1.append(temp1.val);
        temp1=temp1.next;
     }
     while(temp2!=null){
        sb2.append(temp2.val);
        temp2=temp2.next;
     }
     BigInteger num1=new BigInteger(sb1.toString());
     BigInteger num2=new BigInteger(sb2.toString());
     String str=num1.add(num2).toString();
     ListNode dummy=new ListNode(0);
     ListNode curr=dummy;
     for(int i=0;i<str.length();i++){
        curr.next=new ListNode(str.charAt(i)-'0');
        curr=curr.next;
     }
     return dummy.next;
    }
}
