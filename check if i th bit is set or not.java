import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();
       int n=sc.nextInt();
       if((n&(1<<i))!=0){
           System.out.println("set");
       }
       else{
           System.out.println("not set");
       }
        
    }
}
