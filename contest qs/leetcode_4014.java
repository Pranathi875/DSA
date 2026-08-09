class Solution {
    public double minPrice(int[] prices, int[] discounts) {
       double sum=0;
       int min=Math.min(prices.length,discounts.length);
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for(int i=min-1;i>=0;i--){
            int price=prices[prices.length-1-i];
            int discount=discounts[discounts.length-1-i];
            double div=price*((100.0-discount)/100.0);
            sum+=div;
           
        }
        for(int i=0;i<prices.length-min;i++){
           
                sum+=(double)prices[i];
            
        }
        return sum;
    }
}
