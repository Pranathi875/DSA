class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                str=sb.toString();
                return Integer.parseInt(sb.toString());
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
