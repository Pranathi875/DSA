
import java.util.*;
class Main {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       int arr[]={'c','e','g','k','y'};
       char target='f';
       int l=0,r=arr.length-1;
       int x=-1;
       while(l<=r){
           int mid=l+(r-l)/2;
           
            if(arr[mid]<target){
               l=mid+1;
           }
           else{
               r=mid-1;
           }
       }
      
       System.out.println(r);
    }
}
