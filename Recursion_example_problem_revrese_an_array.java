import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        arr=func(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] func(int arr[],int left,int right){
        if(left>=right){
            return arr;
        }
        swap(arr,left,right);
        return func(arr,++left,--right);
    }
    public static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
