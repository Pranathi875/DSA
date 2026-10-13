class Solution {
    public int numIslands(char[][] grid) {
     int count=0;
     int vis[][]=new int[grid.length][grid[0].length];
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'&&vis[i][j]==0){
                vis[i][j]=1;
                count++;
                bfs(grid,vis,i,j);
            }
        }
     }
     return count;
    }
    public static void bfs(char [][]grid,int [][]vis,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        vis[i][j]=1;
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
           int []temp=q.poll();
           int row=temp[0];
           int col=temp[1];
           for(int k=0;k<4;k++){
           int dr[]={-1,1,0,0};
           int dc[]={0,0,-1,1};
           int nr=row+dr[k];
           int nc=col+dc[k];
           if(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]=='1'&&vis[nr][nc]==0){
              vis[nr][nc]=1;
              q.add(new int[]{nr,nc});
           }
        }}
    }
}
