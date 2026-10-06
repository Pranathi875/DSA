class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }
            else{
                int inside=st.pop();
                int score=(inside==0)?1:2*inside;
                int prev=st.pop();
                st.push(prev+score);

            }
        }
        return st.pop();
    }
}
