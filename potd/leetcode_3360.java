class Solution {
    public boolean canAliceWin(int n) {
        int take=10;
        int steps=0;
        while(n>=take){
            n-=take;
            take--;
            steps++;
        }
        if(steps%2==1){
            return true;
        }
        return false;
    }
}
