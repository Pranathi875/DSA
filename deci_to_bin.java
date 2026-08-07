
import java.util.*;
class Main {
    public static void main(String[] args) {
      
       String res="";
       StringBuilder sb=new StringBuilder(res);
       int n=10;
       while(n>0){
          sb.append(n%2);
          n=n/2;
       }
       sb.reverse();
       System.out.println(sb.toString());
    }
}
