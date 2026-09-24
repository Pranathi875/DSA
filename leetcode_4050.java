class Solution {
    public int minDays(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int score=0;score<=n;score++){
            if(dp[score]==Integer.MAX_VALUE){
                continue;
            }
            int points=0;
            for(int len=1;score+points+len<=n;len++){
                points+=len;
                int days=dp[score]+len;
                if(score!=0){
                    days++;
                }
             dp[score+points]=Math.min(dp[score+points],days);
            }
        }
        return dp[n];
    }
}
