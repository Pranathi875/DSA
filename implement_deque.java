import java.util.*;
class Main {
    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
        dq.addFirst(4);
        dq.addLast(7);
        dq.addLast(6);
        
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.addLast(77);
        dq.addFirst(66);
    
        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());
        
        
        
        
    }
}
