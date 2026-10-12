class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int[code.length];
       for(int i=0;i<code.length;i++){
          int sum=0;
          if(k>0){
            for(int j=1;j<=k;j++){
                int idx=(i+j)%n;
                sum+=code[idx];
            }
          }
          else if(k<0){
            for(int j=1;j<=-k;j++){
                int idx=(i-j+n)%n;
                sum+=code[idx];
            }
          }
          arr[i]=sum;
       }
       return arr;
    }
}
