class Solution {
    public int[] nextLargerNodes(ListNode head) {
          ArrayList<Integer>ls=new ArrayList<>();
          ListNode temp=head;
          int count=0;
          while(temp!=null){
            ls.add(temp.val);
            temp=temp.next;
            count++;
          }
          int arr[]=new int[count];
          for(int i=0;i<ls.size();i++){
            int max=0;
            for(int j=i+1;j<ls.size();j++){
                if(ls.get(j)>max&&ls.get(j)>ls.get(i)){
                    max=ls.get(j);
                    break;
                }
            }
            arr[i]=max;
          }
          return arr;

    }
}
