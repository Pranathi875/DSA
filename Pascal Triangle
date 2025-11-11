//print entire pascal triangle
import java.util.*;
class Main {
    private static int pascal(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       for(int i=1;i<=r;i++){
           ArrayList<Integer>temp=new ArrayList<>();
           for(int j=1;j<=i;j++){
               temp.add(pascal(i-1,j-1));
           }
           ans.add(temp);
           
           
       }
        for (ArrayList<Integer> row : ans) {
            System.out.println(row);
        }
       
    }
    
}


//element at specific  (row,column)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        pascal(r-1,c-1);
        System.out.println( pascal(r-1,c-1));
        
    }
    private static int pascal(int n,int r){
        if(r>n){
            return 0;
        }
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
}


//print entire row
//element at specific  (row,column)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int c=1;c<=r;c++){
        System.out.println( pascal(r-1,c-1));
        }
    }
    private static int pascal(int n,int r){
        if(r>n){
            return 0;
        }
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
}

