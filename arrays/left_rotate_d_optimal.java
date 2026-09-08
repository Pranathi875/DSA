lass Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=2;
        int j=d-1;
        for(int i=0;i<d/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=d;i<(n+d)/2;i++){
           int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}




