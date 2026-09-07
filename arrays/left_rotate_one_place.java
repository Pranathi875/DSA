class Main {
    public static void main(String[] args) {
       int arr[]={1,2,3,5,7};
       int first=arr[0];
    for(int i=1;i<arr.length;i++){
        int temp=arr[i];
        arr[i-1]=temp;
    }
    arr[arr.length-1]=first;
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
      

        
    }
}
