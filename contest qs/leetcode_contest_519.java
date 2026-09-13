class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int temp[][]=new int[n][n];
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int newCol=(j-rowShift[i]+n)%n;
                temp[i][newCol]=grid[i][j];
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                int newRow=(i-colShift[j]+n)%n;
                res[newRow][j]=temp[i][j];
            }
        }
        return res;
    }
}©leetcode
