class Solution {
    public static int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aStart=Day(arriveAlice);
        int aEnd=Day(leaveAlice);
        int bStart=Day(arriveBob);
        int bEnd=Day(leaveBob);

        int start=Math.max(aStart,bStart);
        int end=Math.min(bEnd,aEnd);

        return Math.max(0,end-start+1);
    }
    public int Day(String s){
        int month=Integer.parseInt(s.substring(0,2));
        int days=Integer.parseInt(s.substring(3,5));
        int total=days;
        for(int i=0;i<month-1;i++){
            total+=daysInMonth[i];
        }
        return total;
    }
}