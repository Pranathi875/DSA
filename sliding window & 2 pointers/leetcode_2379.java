class Solution {
    public int minimumRecolors(String blocks, int k) {
       int l=0;
       int min=Integer.MAX_VALUE;
       int count=0;
       for(int r=0;r<blocks.length();r++){
         char ch=blocks.charAt(r);
         if(ch=='W'){
            count++;
         }
         if(r-l+1==k){
           min=Math.min(min,count);
           if(blocks.charAt(l)=='W'){
             if(count>0){
                count--;
             } 
           }
           l++;
         }
         
       }
       return min;
    }
}
