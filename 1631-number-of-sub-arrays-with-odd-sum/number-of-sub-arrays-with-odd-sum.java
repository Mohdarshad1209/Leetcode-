class Solution {
    public int numOfSubarrays(int[] arr) {
        int even=1;
        int odd=0;
        int preSum=0;
        long cnt=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(preSum%2==0){
                cnt+=odd;
                even++;
            }else{
                cnt+=even;
                odd++;
            }
        }
        return (int)(cnt%1000000007);
    }
}