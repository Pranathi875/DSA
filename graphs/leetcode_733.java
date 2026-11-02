class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int iniColor=image[sr][sc];
        if(iniColor==color){
            return image;
        }
        dfs(sr,sc,image,color,iniColor);
        return image;
    }
    public void dfs(int row,int col,int [][]image,int newColor,int iniColor){
         image[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;
        int []delRow={-1,0,1,0};
        int []delCol={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&image[nrow][ncol]==iniColor){
                dfs(nrow,ncol,image,newColor,iniColor);
            }
        }
    }
}
