class Solution {
    public boolean isPerfectSquare(int num) {
       int l=1,h=num;
       while(l<=h){
          int mid=l+(h-l)/2;
           long square=(long)mid*mid;
          if(square==num){
            return true;
          }
          else if(square>num){
             h=mid-1;
          }
          else{
            l=mid+1;
          }
       }
      return false;

    }
}
