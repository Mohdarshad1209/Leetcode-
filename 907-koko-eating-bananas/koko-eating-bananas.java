class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MIN_VALUE;
        for(int p:piles){
            right=Math.max(p,right);
        }
        while(right>=left){
            int mid=left+(right-left)/2;
            if(canEat(piles,mid,h)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean canEat(int[] piles,int mid,int h){
        long hrs=0;
        for(int p:piles){
            int div=p/mid;
            hrs+=div;
            if(p%mid!=0) hrs++;
        }
        return h>=hrs;
    }
}