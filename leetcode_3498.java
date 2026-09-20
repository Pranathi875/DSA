class Solution {
    public int reverseDegree(String s) {
     HashMap<Character,Integer>hm=new HashMap<>();
     char ch='a';
     for(int i=26;i>=1;i--){
       hm.put(ch,i);
       ch+=1;
     }
     int sum=0;
     for(int i=0;i<s.length();i++){
        int prod=hm.get(s.charAt(i))*(i+1);
        sum+=prod;
     }
     return sum;
    }
}
