class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>>res=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while((i<intervals.length)&&(intervals[i][1] < newInterval[0])){
            res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        int newMin=newInterval[0];
        int newMax=newInterval[1];
        while(i<n&&intervals[i][0]<=newMax){
             newMin=Math.min(newMin,intervals[i][0]);
             newMax=Math.max(newMax,intervals[i][1]);
             i++;
        }
        res.add(Arrays.asList(newMin,newMax));
        while(i<n){
            res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        int ans[][]=new int[res.size()][2];
        for(int j=0;j<ans.length;j++){
            ans[j][0]=res.get(j).get(0);
            ans[j][1]=res.get(j).get(1);
        }
        return ans;
    }
}
