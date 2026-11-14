class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int curSum=0;
            for(int j=i;j<nums.size();j++){
                int size=j-i+1;
                if(size>r) break;
                curSum+=nums.get(j);
                if(size>=l && curSum>0){
                    min=Math.min(min,curSum);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}