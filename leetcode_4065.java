class Solution {
    public int[] rearrangeArray(int[] nums) {
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(true){
            boolean found=false;
            for(int num=1;num<=100;num++){
                if(freq[num]>0){
                    ans.add(num);
                    freq[num]--;
                    found=true;
                }
            }
            if(!found){
                break;
            }
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
