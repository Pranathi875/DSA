
import java.util.*;
class Main {
    public static void main(String[] args) {      
       HashMap<Character,Integer>hm1=new HashMap<>();
       HashMap<Character,Integer>hm2=new HashMap<>();
       String a="aabcdd";
       String b="adbcda";
       for(int i=0;i<a.length();i++){
          char key=a.charAt(i);
          hm1.put(key,hm1.getOrDefault(key,0)+1);}
          for(int i=0;i<b.length();i++){
           char key=b.charAt(i);
          hm2.put(key,hm2.getOrDefault(key,0)+1);}
          boolean res=func(hm1,hm2);
          System.out.println(res);
    }
    public static boolean func(HashMap<Character,Integer>hm1,HashMap<Character,Integer>hm2){
        for(char ch:hm1.keySet()){
            if(!hm2.containsKey(ch)){
                return false;
            }
        }
        return true;
    }
}
