class Solution {
    public int[] constructRectangle(int area) {
        int width=(int)Math.sqrt(area);
        int k=width;
        while(area%k!=0){
            k--;
        }
        return new int []{area/k,k};
    }
}
