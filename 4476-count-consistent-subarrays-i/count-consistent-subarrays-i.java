class Solution {
    public int countConsistent(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int curAnd=nums[i];
            int curMin=nums[i];
            for(int j=i;j<n;j++){
                curAnd&=nums[j];
                curMin=Math.min(curMin,nums[j]);
                if(curAnd==curMin){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}