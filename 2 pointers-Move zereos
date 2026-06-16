class Main {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int l=0;// position where next non zero element should be placed
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;  //swap them
                l++; // place non zero element at correct position
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}
    }
}
