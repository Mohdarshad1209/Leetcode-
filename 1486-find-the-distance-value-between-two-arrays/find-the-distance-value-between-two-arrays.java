class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int a:arr1){
            if(valid(a,arr2,d)) cnt++;
        }
        return cnt;
    }
    private boolean valid(int n,int[] arr,int d){
        for(int a:arr){
            if(Math.abs(a-n)<=d) return false;
        }
        return true;
    }
}