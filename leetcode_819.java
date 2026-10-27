class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      paragraph=paragraph.toLowerCase();
      paragraph = paragraph.replaceAll("[^a-z ]", " ");
      String words[]=paragraph.split("\\s+");
      HashMap<String,Integer>hm=new HashMap<>();
      for(int i=0;i<words.length;i++){
        String key=words[i];
        hm.put(key,hm.getOrDefault(key,0)+1);
      }
       for(int i=0;i<banned.length;i++){
        if(hm.containsKey(banned[i])){
            hm.remove(banned[i]);
        }
       }
       String ans="";
       int max=Integer.MIN_VALUE;
       for(String keys:hm.keySet()){
          if(hm.get(keys)>max){
            max=hm.get(keys);
            ans=keys;
          }
       }
       return ans;
    }
}
