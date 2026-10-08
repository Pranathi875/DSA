import java.util.*;
class Main {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
        int n=3,m=3;
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }
             //1----2
            ls.get(1).add(2);
            ls.get(2).add(1);
            //2----3
            ls.get(2).add(3);
            ls.get(3).add(2);
            //1----3
            ls.get(1).add(3);
            ls.get(3).add(1);
        for(int i=1;i<=n;i++) {
            System.out.println(i+" "+ls.get(i));
        }
        
    }
}
