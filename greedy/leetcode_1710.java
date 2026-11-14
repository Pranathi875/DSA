class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
      int total=0;
      for(int i=0;i<boxTypes.length;i++){
         int take=Math.min(truckSize,boxTypes[i][0]);
         total+=take*boxTypes[i][1];
         truckSize-=take;
         if(truckSize==0){
            break;
         }
      }
      return total;
    }
}
