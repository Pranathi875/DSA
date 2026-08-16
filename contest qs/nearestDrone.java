class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
       int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int []val=drones[i];
            int abs=Math.abs(val[0]-target[0])+Math.abs(val[1]-target[1]);
            if(abs<=val[2]&&abs<min){
                min=abs;
                ans=i;
                
            }
        }
        return ans;
         
    }
}©leetcode
