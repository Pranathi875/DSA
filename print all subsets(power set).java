import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       List<List<Integer>>ans=new ArrayList<>();
       int arr[]={1,2,3,4};
       int n=arr.length;
       int subsets=1<<n;
       for(int i=0;i<subsets;i++){
           List<Integer>ls=new ArrayList<>();
           for(int j=0;j<n;j++){
               if((i&(1<<j))!=0){
                   ls.add(arr[j]);
               }
           }
           ans.add(ls);
       }
       System.out.println(ans);
       
    }      
}
