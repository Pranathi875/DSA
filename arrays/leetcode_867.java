class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              ans[j][i]=matrix[i][j];
          }
        }
        return ans;
    }
}
