class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int cnt=0;
        while(coins>=0&&i<costs.length){
            if(coins-costs[i]>=0){
                coins=coins-costs[i];
                cnt++;
            }
            else{
                break;
            }
            i++;
        }
        return cnt;
    }
}
