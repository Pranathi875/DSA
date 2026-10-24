class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int months[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a1=getDay(arriveAlice,months);
        int a2=getDay(leaveAlice,months);
        int b1=getDay(arriveBob,months);
        int b2=getDay(leaveBob,months);
        int start=Math.max(a1,b1);
        int end=Math.min(a2,b2);
        return Math.max(0,end-start+1);
    }
    public int getDay(String date,int []months){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=months[i];
        }
        return total;
    }
}
