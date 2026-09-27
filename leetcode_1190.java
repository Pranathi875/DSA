class Solution {
    public String reverseParentheses(String s) {
       Stack<Character>st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
          if(ch=='('||(ch>='a'&&ch<='z')){
            st.push(ch);
          }
          else{
            StringBuilder sb=new StringBuilder();
            
            while(st.peek()!='('){
                char ch2=st.pop();
                sb.append(ch2);
            }
            st.pop();
            String s2=sb.toString();
            
            for(int j=0;j<s2.length();j++){
                st.push(s2.charAt(j));
            }

            
          }
       }
       StringBuilder sb2=new StringBuilder();
       for(int i=0;i<st.size();i++){
          sb2.append(st.get(i));
       }
       return sb2.toString();
    }
}
