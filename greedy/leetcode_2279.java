class Solution {
    public int maximumBags(int[] c, int[] r, int ar) {
        int req[]=new int[c.length];
        int cnt=0;
        for(int i=0;i<c.length;i++){
            req[i]=c[i]-r[i];
        }
        Arrays.sort(req);
        for(int i=0;i<req.length;i++){
            if(req[i]<=ar){
                ar-=req[i];
                cnt++;
            }
            else{
                break;
            }
        }
       
        return cnt;
    }
}
