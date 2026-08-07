import java.util.*;
class Node{
    Node next;
    String data;
    Node(String data){
        this.next=null;
        this.data=data;
    }
}
class Main {
    public static void main(String[] args) {
        Node node1=new Node("A");
        Node node2=new Node("B");
        Node node3=new Node("C");
        Node node4=new Node("D");
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        Node head=node1;
        Node temp=head;
        Node newNode=new Node("E");
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node nextNode=temp.next;
        temp.next=newNode;
        newNode.next=nextNode;
        head=node1;
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}
