class Solution {
    public ListNode doubleIt(ListNode head) {
         ListNode temp=head;
         StringBuilder sb=new StringBuilder();
         while(temp!=null){
           sb.append(temp.val);
           temp=temp.next;
         }
         String s=sb.toString();
         StringBuilder res=new StringBuilder();
         int carry=0;
         for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';
            int prod=digit*2+carry;
            res.append(prod%10);
            carry=prod/10;

         }
         if(carry>0){
            res.append(carry);
         }
         res.reverse();
         String str=res.toString();
       
         int arr[]=new int[str.length()];
         for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i)-'0';
         }
         ListNode dummy=new ListNode(-1);
         ListNode curr=dummy;
        
         for(int i=0;i<arr.length;i++){
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
         }
         return dummy.next;
    }
}
