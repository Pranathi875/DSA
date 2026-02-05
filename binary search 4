import java.util.*;
class Main {
    public static void main(String[] args) {
      int arr[]={1,2,3,3,3,4,5,6};
      int target=3;
      int l=0,r=arr.length-1;
      while(l<=r){
          int mid=(l+r)/2;
          if(arr[mid]==target){
              l=mid+1;
          }
          else  if(arr[mid]>target){
              r=mid-1;
          }
          else{
              l=mid+1;
      }
    }
    System.out.println(r);
    System.out.println(arr[r]);
}}
