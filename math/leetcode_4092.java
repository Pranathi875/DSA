class Solution {
    public int calculateScore(int a, int b) {
       String s1="";
       String s2="";
       int n1=a;
       int n2=b;
        while(n1>0){
            int rem=n1%2;
            s1=s1+rem;
            n1/=2;
        }
         while(n2>0){
            int rem=n2%2;
            s2=s2+rem;
            n2/=2;
        }
        int cnt1=0,cnt2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                cnt1++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='1'){
                cnt2++;
            }
        }
        if(cnt1>=cnt2){
            return cnt1*cnt2;
        }
        return cnt2/cnt1;
    }
}
