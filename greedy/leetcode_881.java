class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int cnt=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                cnt++;
            }
            else if(people[j]<=limit){
                j--;
                cnt++;
            }
        }
        return cnt;
    }
}
