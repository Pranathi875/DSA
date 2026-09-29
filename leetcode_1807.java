class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
      HashMap<String,String>hm=new HashMap<>();
      for(List<String>pair:knowledge){
        hm.put(pair.get(0),pair.get(1));
      }
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            i++;
            StringBuilder sb2=new StringBuilder();
            while(s.charAt(i)!=')'){
                sb2.append(s.charAt(i));
                i++;
            }
            if(hm.containsKey(sb2.toString())){
                ans.append(hm.get(sb2.toString()));
            }
            else{
                ans.append("?");
            }
        }
        else{
            ans.append(ch);
        }
      }
      return ans.toString();
    }
}
