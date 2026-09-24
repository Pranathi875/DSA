class Solution {
    public boolean isPalindromic(String s) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
           int n=s.charAt(i);
           String str=binaryRep(n);
           sb.append(str);
       }
       String ans=sb.toString();
       boolean result=palindromeCheck(ans);
        return result;
    }
    public static String binaryRep(int n){
        String s=String.format("%8s",Integer.toBinaryString(n)).replace(' ','0');
       return s;
    }
    public static boolean palindromeCheck(String ans){
        int len=ans.length();
        int j=len-1;
        for(int i=0;i<len/2;i++){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
