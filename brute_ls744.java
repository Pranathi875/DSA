class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        char ans=letters[0];
      for(int i=0;i<letters.length;i++){
        int val=letters[i]-target;
        if(val>0&&val<min){
            min=val;
           
            ans=letters[i];
        }
      }
     return ans;
     
    }
}
