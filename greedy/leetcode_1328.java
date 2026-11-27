class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==0||palindrome.length()==1){
            return "";
        }
        
        StringBuilder sb=new StringBuilder(palindrome);
        for(int i=0;i<palindrome.length()/2;i++){
            if(palindrome.charAt(i)!='a'){
                sb.setCharAt(i,'a');
                return sb.toString();
            }
        }
        sb.setCharAt(palindrome.length()-1,'b');
        return sb.toString();
    }
}
