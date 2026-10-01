class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        for(int i=0;i<digits.length;i++){
            int key=digits[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(int i=100;i<=999;i++){
            String str=String.valueOf(i);
            if(i%2==0){
                int d1=str.charAt(0)-'0';
                int d2=str.charAt(1)-'0';
                int d3=str.charAt(2)-'0';
            HashMap<Integer,Integer>temp=new HashMap<>(hm);
            if(temp.getOrDefault(d1,0)>0){
                temp.put(d1,temp.get(d1)-1);
            }
            else{
                continue;
            }
             if(temp.getOrDefault(d2,0)>0){
                temp.put(d2,temp.get(d2)-1);
            }
            else{
                continue;
            }
             if(temp.getOrDefault(d3,0)>0){
                count++;
            }

            
        }}
        return count;
    }
}
