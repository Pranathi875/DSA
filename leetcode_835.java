class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        ArrayList<int []>a=new ArrayList<>();
        ArrayList<int[]>b=new ArrayList<>();
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1.length;j++){
                if(img1[i][j]==1){
                    a.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    b.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        HashMap<String,Integer>hm=new HashMap<>();
        for(int []p1:a){
            for(int []p2:b){
                int row=p1[0]-p2[0];
                int col=p1[1]-p2[1];
                String key=row+","+col;
                int count=hm.getOrDefault(key,0)+1;
                hm.put(key,count);
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
