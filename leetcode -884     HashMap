class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String words1[]=s1.split(" ");
      String words2[]=s2.split(" ");
      HashMap<String,Integer>hm=new HashMap<>();
      ArrayList<String>ls=new ArrayList<>();
      for(int i=0;i<words1.length;i++){
          String key=words1[i];
          hm.put(key,hm.getOrDefault(key,0)+1);
      }
      for(int i=0;i<words2.length;i++){
        String key=words2[i];
        hm.put(key,hm.getOrDefault(key,0)+1);
      }

      for(String str:hm.keySet()){
        int val=hm.get(str);
        if(val==1){
            ls.add(str);
        }
      }
     String[] arr = ls.toArray(new String[0]);
     return arr;



    }
}
